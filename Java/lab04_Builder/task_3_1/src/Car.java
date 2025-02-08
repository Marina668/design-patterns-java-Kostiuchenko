public class Car {

    public static class CarBuilder {
        private Type type = Type.Sedan;
        private CarColor carColor = CarColor.White;
        private Engine engine = (new Engine.EngineBuilder()).build();
        private Wheel wheel = (new Wheel.WheelBuilder()).build();

        private Transmission transmission = (new Transmission.TransmissionBuilder()).build();

        public CarBuilder setType(Type type) {
            this.type = type;
            return this;
        }

        public CarBuilder setCarColor(CarColor carColor) {
            this.carColor = carColor;
            return this;
        }

        public CarBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheel(Wheel wheel) {
            this.wheel = wheel;
            return this;
        }

        public CarBuilder setTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public Car build() {
            return new Car(
                    type,
                    carColor,
                    engine,
                    wheel,
                    transmission
            );
        }
    }


    public enum CarColor {   // Колір автомобіля
        White,  //  Білий
        Black,  //  Чорний
        Red,    //  Червоний
        Grey    //  Сірий
    }

    public enum Type {  //  Тип кузову автомобіля
        Sedan,      //  Седан
        Hatchback,  //  Хетчбек
        SUV         //  Кросовер
    }

    final private Type type;          //  Тип кузову
    final private CarColor carColor;  //  Колір
    final private Engine engine;      //  Двигун
    final private Wheel wheel;        //  Колеса

    final private Transmission transmission;        //  Трансмісія

    public Car(Type type, CarColor carColor,
               Engine engine, Wheel wheel, Transmission transmission) {
        this.type = type;
        this.carColor = carColor;
        this.engine = engine;
        this.wheel = wheel;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "type=" + type +
                ",\ncarColor=" + carColor +
                ",\nengine=" + engine +
                ",\nwheel=" + wheel +
                ",\ntransmission=" + transmission +
                '\n';
    }
}
