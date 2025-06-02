package gr.aueb.cf.ch19.mono_parking;

public class Main {

    public static void main(String[] args) {

        MonoParking parking = new MonoParking();

        parking.addLast("IBE2254");
        parking.addLast("IBZ2255");
        parking.addLast("IBΘ2256");
        parking.addLast("IBΡ2257");

        String removed = parking.removeLast();
        System.out.println(removed);
        System.out.println();
        System.out.println();


        parking.traverse();

    }
}
