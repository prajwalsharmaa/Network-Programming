import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExample {

    public static void main(String[] args) {

        try {

            // 1. IPv4 LOOPBACK
            // Refers to the current computer itself.
            InetAddress loopbackIPv4 = InetAddress.getByName("127.0.0.1");

            System.out.println("1. IPv4 Loopback");
            printAddressInfo(loopbackIPv4);


            // 2. IPv4 PRIVATE / SITE-LOCAL
            // Used inside private networks such as home or office networks.
            InetAddress privateIPv4 = InetAddress.getByName("192.168.1.10");

            System.out.println("\n2. IPv4 Private / Site-Local");
            printAddressInfo(privateIPv4);


            // 3. IPv4 LINK-LOCAL
            // Automatically used when a device cannot obtain an IPv4
            // address from DHCP.
            InetAddress linkLocalIPv4 = InetAddress.getByName("169.254.1.10");

            System.out.println("\n3. IPv4 Link-Local");
            printAddressInfo(linkLocalIPv4);


            // 4. IPv4 MULTICAST
            // Used to send data from one sender to multiple receivers
            // that have joined the multicast group.
            InetAddress multicastIPv4 = InetAddress.getByName("224.0.0.1");

            System.out.println("\n4. IPv4 Multicast");
            printAddressInfo(multicastIPv4);


            // 5. IPv4 GLOBAL / PUBLIC
            // A publicly routable IPv4 address.
            // 8.8.8.8 is Google's public DNS address.
            InetAddress globalIPv4 = InetAddress.getByName("8.8.8.8");

            System.out.println("\n5. IPv4 Global / Public");
            printAddressInfo(globalIPv4);


            // 6. IPv6 LOOPBACK
            // IPv6 equivalent of 127.0.0.1.
            InetAddress loopbackIPv6 = InetAddress.getByName("::1");

            System.out.println("\n6. IPv6 Loopback");
            printAddressInfo(loopbackIPv6);


            // 7. IPv6 LINK-LOCAL
            // Used for communication on the local network link.
            InetAddress linkLocalIPv6 = InetAddress.getByName("fe80::1");

            System.out.println("\n7. IPv6 Link-Local");
            printAddressInfo(linkLocalIPv6);


            // 8. IPv6 MULTICAST
            // ff02::1 represents all IPv6 nodes on the local link.
            InetAddress multicastIPv6 = InetAddress.getByName("ff02::1");

            System.out.println("\n8. IPv6 Multicast");
            printAddressInfo(multicastIPv6);


            // 9. IPv6 GLOBAL / PUBLIC
            // Public/global IPv6 address.
            // This is one of Google's public DNS IPv6 addresses.
            InetAddress globalIPv6 =
                    InetAddress.getByName("2001:4860:4860::8888");

            System.out.println("\n9. IPv6 Global / Public");
            printAddressInfo(globalIPv6);


            // 10. ANY-LOCAL / WILDCARD
            // 0.0.0.0 does not represent a specific computer.
            // It means "any local network interface".
            InetAddress anyLocal = InetAddress.getByName("0.0.0.0");

            System.out.println("\n10. IPv4 Any-Local / Wildcard");
            printAddressInfo(anyLocal);


        } catch (UnknownHostException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    // This method prints common information about an InetAddress.
    static void printAddressInfo(InetAddress address) {

        System.out.println("Host Name: "
                + address.getHostName());

        System.out.println("Host Address: "
                + address.getHostAddress());

        System.out.println("Canonical Host Name: "
                + address.getCanonicalHostName());

        System.out.println("Is Loopback: "
                + address.isLoopbackAddress());

        System.out.println("Is Link Local: "
                + address.isLinkLocalAddress());

        System.out.println("Is Site Local: "
                + address.isSiteLocalAddress());

        System.out.println("Is Multicast: "
                + address.isMulticastAddress());

        System.out.println("Is Any Local: "
                + address.isAnyLocalAddress());
    }
}