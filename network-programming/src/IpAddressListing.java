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
        //program to list assigned ip addresses of network interface
        //1.Explain inet address .Why inet address is used in networking .List out different methods provided by Java InetAddress Class
        //2.same for network interface
    }
}
