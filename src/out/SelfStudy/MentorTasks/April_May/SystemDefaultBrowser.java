package out.SelfStudy.MentorTasks.April_May;
import java.io.IOException;
import java.net.URI;// URI - uniform resource identifier
import java.net.URISyntaxException;

public class SystemDefaultBrowser {



        public static void main(String[] args) throws URISyntaxException, IOException {


            URI uri = new URI("https://my.cydeo.com/login");
            java.awt.Desktop.getDesktop().browse(uri);
            System.out.println("Web page opened in browser");



        }
}
