import java.util.List;
import java.io.*;

public class Start {


    public static void main(String[] args) throws Exception {
        
        String web = getSite() +"uebungen.html";
        String web2 = getSite();
        Fb16converter con = new Fb16converter();
        Download dl = new Download();
        @SuppressWarnings("unchecked")
        List<Uebung> nl = con.getData(web);
        dl.loadFiles(nl,web2);

    }
    
    public static String getSite() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bfFile = new BufferedReader(new FileReader("source.list"));
        int i = 1;
        String input = null;
        while((input = bfFile.readLine()) != null){
            System.out.println(i+":  " + input);
            i++;
        }
        System.out.println(i);
        String[] urlList = new String[i];
        i = 0;
        while((input = bfFile.readLine()) != null){
            urlList[i] = input;       
            i++;
        }
        System.out.println("Von welcher Adresse holen:");
        return urlList[bf.read()-1] ; 
        
        
     
        
    }

}
