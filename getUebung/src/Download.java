import java.util.*;


public class Download {
    
    Download(){
        
    }

    
    public void loadFiles(List<Uebung> fileList, String webUrl){
        String x = null;
        System.out.println(fileList);
        System.out.println(fileList.size());
        for(int i = 0; i < fileList.size(); i++){
            x = webUrl + fileList.get(i).getName();
            System.out.println(x);
        }
    }
        
    
}
