import java.net.NetworkInterface;
import java.util.Enumeration;

public class NetworkInterfaceEg {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces =
                    NetworkInterface.getNetworkInterfaces();

            while (interfaces.hasMoreElements()) {

                NetworkInterface ni = interfaces.nextElement();

                System.out.println("Name: " + ni.getName());
                System.out.println("Display Name: " + ni.getDisplayName());
            }
            NetworkInterface ni = NetworkInterface.getByName("wireless_7");
            System.out.println("Network Interface DisplayName : "+ni.getDisplayName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}