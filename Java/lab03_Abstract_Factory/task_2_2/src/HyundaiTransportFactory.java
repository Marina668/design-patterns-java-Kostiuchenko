public class HyundaiTransportFactory implements TransportFactory {
    @Override
    public Bus createBus() {
        return new HyundaiBus();
    }

    @Override
    public Tram createTram() {
        return new HyundaiTram();
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new HyundaiTrolleybus();
    }

    @Override
    public String getBrand() {
        return "Hyundai";
    }
}
