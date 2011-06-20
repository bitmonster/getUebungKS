import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
 
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class Fb16converter throws Exception{
    URL url = new URL("http://www.mathematik.uni-kassel.de/mathfb16/SS11/DiskStruk/uebungen.html");
    URLConnection con = url.openConnection();
    
    BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
    
    HTMLEditorKit eKit = new HTMLEditorKit();
    HTMLDocument htmlDoc = new HTMLDocument();
    htmlDoc.putProperty("IdnoreCharsetDirective", Boolean.TRUE);
    eKit.read(br, htmlDoc,0);
    
    HTMLDocument.Iterator iter = htmlDoc.getIterator(HTML.Tag.A);
    
    while(iter.isValid()){
        System.out.println(iter.getAttributes().getAttribute(HTML.Attribute.HREF));
        iter.next();
    }
    
}