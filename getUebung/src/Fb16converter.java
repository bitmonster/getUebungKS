import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
 
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import java.util.*;


public class Fb16converter {
    
public static List getData(String address) throws Exception{
    List<Uebung> list1 = new LinkedList<Uebung>();
    
    URL url = new URL(address);
    URLConnection con = url.openConnection();
   
    BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
    HTMLEditorKit eKit = new HTMLEditorKit();
    HTMLDocument htmlDoc = new HTMLDocument();
    htmlDoc.putProperty("IgnoreCharsetDirective", Boolean.TRUE);
    eKit.read(br, htmlDoc,0);
    
    HTMLDocument.Iterator iter = htmlDoc.getIterator(HTML.Tag.A);
    
    while(iter.isValid()){
        String x = (String)iter.getAttributes().getAttribute(HTML.Attribute.HREF);
        //System.out.println(x);
       if(x.indexOf(".pdf")!= -1){
           list1.add( new Uebung(x,false));
       }
       
        iter.next();
    }
    return list1;
    }

}