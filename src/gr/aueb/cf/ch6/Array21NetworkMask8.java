package gr.aueb.cf.ch6;

public class Array21NetworkMask8 {
    public static void main(String[] args) {
        // Διεύθυνση IP: 192.168.1.10
        int[] ip = {192, 168, 1, 10};

        // Μάσκα Υποδικτύου (Subnet Mask): 255.255.255.0
        int[] subnetMask = {255, 255, 255, 0};

        // Υπολογισμός διεύθυνσης δικτύου (Bitwise AND σε κάθε bit)
        int[] networkAddress = new int[4];

        for (int i = 0; i < 4; i++) {
            networkAddress[i] = ip[i] & subnetMask[i];
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("IP Address: %d.%d.%d.%d\n", ip[0], ip[1], ip[2], ip[3]);
        System.out.printf("Network Mask: %d.%d.%d.%d\n", subnetMask[0], subnetMask[1], subnetMask[2], subnetMask[3]);
        System.out.printf("Network Address: %d.%d.%d.%d\n", networkAddress[0], networkAddress[1], networkAddress[2], networkAddress[3]);
    }
}
