public class Transmission {

    public static class TransmissionBuilder {
        private int gearsNumber = 5;
        private Transmission.Type type = Transmission.Type.Manual;

        public TransmissionBuilder setGearsNumber(int gearsNumber) {
            this.gearsNumber = gearsNumber;
            return this;
        }

        public TransmissionBuilder setType(Transmission.Type type) {
            this.type = type;
            return this;
        }

        public Transmission build(){
            return new Transmission(gearsNumber,type);
        }
    }

    enum Type{
        Manual,
        Automatic,
        CVT
    }
    private final int gearsNumber;
    private final Type type;

    public Transmission(int gearsNumber, Type type) {
        this.gearsNumber = gearsNumber;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "gearsNumber=" + gearsNumber +
                ", type=" + type +
                '}';
    }
}