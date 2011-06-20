import java.util.List;


public class Start {


    public static void main(String[] args) throws Exception {
        
        String web = "http://www.mathematik.uni-kassel.de/mathfb16/SS11/DiskStruk/uebungen.html";
        String web2 = "http://www.mathematik.uni-kassel.de/mathfb16/SS11/DiskStruk/";
        Fb16converter con = new Fb16converter();
        Download dl = new Download();
        @SuppressWarnings("unchecked")
        List<Uebung> nl = con.getData(web);
        dl.loadFiles(nl,web2);


    }

}
