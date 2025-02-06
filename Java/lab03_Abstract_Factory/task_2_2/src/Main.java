import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Tram> trams = new ArrayList<>();
        ArrayList<Trolleybus> trolleybuses = new ArrayList<>();

        final int A = 10;       // закупити A автобусів
        final int T = 5;        // закупити T трамваїв
        final int Tr = 40;      // закупити Tr – тролейбусів
        final int N = 200_000;  // орієнтований пробіг експлуатації

        int minOverallCost = Integer.MAX_VALUE;
        String bestBrand = "";

        TransportFactory hyundaiFactory = new HyundaiTransportFactory();
        TransportFactory skodaFactory = new SkodaTransportFactory();
        TransportFactory volvoFactory = new VolvoTransportFactory();
        ArrayList<TransportFactory> factories = new ArrayList<>();
        factories.add(hyundaiFactory);
        factories.add(skodaFactory);
        factories.add(volvoFactory);

        for (TransportFactory factory : factories) {

            for (int i = 0; i < A; i++) {
                Bus bus = factory.createBus();
                buses.add(bus);
            }

            for (int i = 0; i < T; i++) {
                Tram tram = factory.createTram();
                trams.add(tram);
            }

            for (int i = 0; i < Tr; i++) {
                Trolleybus trolley = factory.createTrolleybus();
                trolleybuses.add(trolley);
            }

            int finalCostContract = 0;
            for (Bus bus : buses) {
                finalCostContract += bus.getCost() + bus.getUsageCost() * N;
            }

            for (Tram tram : trams) {
                finalCostContract += tram.getCost() + tram.getUsageCost() * N;
            }

            for (Trolleybus trolleybus : trolleybuses) {
                finalCostContract += trolleybus.getCost() + trolleybus.getUsageCost() * N;
            }

            if (minOverallCost > finalCostContract) {
                minOverallCost = finalCostContract;
                bestBrand = factory.getBrand();
            }
        }
        System.out.println("The best сost " + minOverallCost + " with transport by " + bestBrand);
    }
}
