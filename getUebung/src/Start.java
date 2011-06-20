import java.util.LinkedList;
import java.util.List;
import java.io.*;

public class Start {


    public static void main(String[] args) throws Exception {
        String site = getSite();
        String web = site +"uebungen.html";
        String web2 = site;
        Fb16converter con = new Fb16converter();
        Download dl = new Download();
        @SuppressWarnings("unchecked")
        List<Uebung> nl = con.getData(web);
        dl.loadFiles(nl,web2);

    }
    
    public static String getSite() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bfFile = new BufferedReader(new FileReader("source.list"));
        List<String> choose = new LinkedList<String>();
        String input = null;
        int i = 0;
        while((input = bfFile.readLine()) != null){
            System.out.println(i+":  " + input);
            choose.add(input);
            i++;
        }
        
        System.out.println("Von welcher Adresse holen:");
        int r = Integer.parseInt(bf.readLine());
        //noch hinzufügen max index check
        return choose.get(r);     
        
    }

}
