
import java.io.IOException;
import java.net.URL;

public class practice {

    practice()
    {
        public static void main (String args[]) throws IOException
        {
            URL url =new URL("https://www.example.com/path?param1=value1&param2=value2#fragment");

            System.out.println ("protocol ="url.getProtocol());

        }
    }
}
