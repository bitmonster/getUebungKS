import java.util.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Download {
    
    Download(){
    	
    }
    
    
    public void loadFiles(List<Uebung> fileList, String webUrl) throws IOException{
    	// download
    	
        for(int i = 0; i < fileList.size(); i++){
            
            URL xu = new URL(webUrl +"/" +fileList.get(i).getName());
            URLConnection uc = xu.openConnection();
            String contentType = uc.getContentType();
            int contentLength = uc.getContentLength();
            if(contentType.startsWith("/text") || contentLength == -1){
            	throw new IOException("Kein Binary");
            }
            InputStream raw = uc.getInputStream();
            InputStream in = new BufferedInputStream(raw);
            byte[] data = new byte[contentLength];
            int bytesRead = 0;
            int offset = 0;
            while(offset < contentLength){
            	bytesRead = in.read(data,offset,data.length -offset);
            	if(bytesRead == -1){
            		break;
            	}
            	offset += bytesRead;
            }
            in.close();
            
            if(offset != contentLength){
            	throw new IOException("Datei nicht komplett geladen");
            }
            
            String dataName = xu.getFile();
            String dN = dataName.substring(dataName.lastIndexOf('/')+1);
            FileOutputStream out = new FileOutputStream(dN);
            out.write(data);
            out.close();
            // setzt geladene objekte auf geladen 
            fileList.get(i).setGet(true);
        }
    }
        
    
}
