
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class exam11 {
    public static void main(String[] args) throws IOException {
        try {
            // Get the local host address
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Address: " + localHost);

            // Get IP addresses associated with a hostname
            InetAddress[] googleAddresses = InetAddress.getAllByName("www.google.com");
            System.out.println("Google IP Addresses:");
            for (InetAddress address : googleAddresses) {
                System.out.println(" " + address);
            }

            // Get the host name of an IP address
            InetAddress address = InetAddress.getByName("8.8.8.8");
            System.out.println("Host Name for 8.8.8.8: " + address.getHostName());

            // Check if an address is reachable
            System.out.println("Is Google Reachable? " +
                    googleAddresses[0].isReachable(5000)); // 5000 milliseconds
            // timeout

            // Get the canonical host name
            System.out.println("Canonical Host Name for " + localHost + ": " +
                    localHost.getCanonicalHostName());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
