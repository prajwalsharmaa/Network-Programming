import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class IpAddressListing {
    static void main() throws SocketException {
        NetworkInterface ni = NetworkInterface.getByName("wireless_32769");
        Enumeration<InetAddress> ins = ni.getInetAddresses();

        while (ins.hasMoreElements()){
            System.out.println("Inet Address: "+ins.nextElement());
        }

    }
}
