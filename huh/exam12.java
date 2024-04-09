import java.net.URL;
import java.io.IOException;
import java.net.MalformedURLException;

public class exam12 {
    public static void main(String[] args) throws IOException {
        try {
            // Create a URL object
            URL url = new URL("https://www.example.com/path?param1=value1&param2=value2#fragment");

            // Display various information using URL methods
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Reference (Fragment): " + url.getRef());
            System.out.println("File: " + url.getFile());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("UserInfo: " + url.getUserInfo());
            System.out.println("Content: " + url.getContent());
            System.out.println("Default Port: " + url.getDefaultPort());
            System.out.println("To External Form: " + url.toExternalForm());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
