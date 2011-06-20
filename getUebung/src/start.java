import java.util.List;


public class start {


    public void main(String[] args) throws Exception {
        String web = "http://www.mathematik.uni-kassel.de/mathfb16/SS11/DiskStruk/uebungen.html";
        
        Fb16converter con = new Fb16converter();
        Download dl = new Download();
        List<Uebung> nl = con.getData(web);
        dl.loadFiles(nl,web);


    }

}
