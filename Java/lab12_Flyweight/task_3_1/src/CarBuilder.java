public class CarBuilder {

    private final EngineFactory engineFactory = new EngineFactory();
    private final WheelFactory wheelFactory = new WheelFactory();

    public CarBuilder setType(Car.Type type) {
        this.type = type;
        return this;
    }

    public CarBuilder setCarColor(Car.CarColor carColor) {
        this.carColor = carColor;
        return this;
    }

    public CarBuilder setEngine(int power, Engine.Fuel fuel) {
        this.engine = engineFactory.getEngine(power, fuel);
        return this;
    }

    public CarBuilder setWheel(int diameter) {
        this.wheel = wheelFactory.getWheel(diameter);
        return this;
    }

    private Car.Type type;
    private Car.CarColor carColor;
    private Engine engine;
    private Wheel wheel;

    public CarBuilder reset() {
        type = Car.Type.Sedan;
        carColor = Car.CarColor.White;
        engine = engineFactory.getEngine(105, Engine.Fuel.Petrol);
        wheel = wheelFactory.getWheel(17);
        return this;
    }

    public CarBuilder() {
        reset();
    }

    public Car build() {

        if (type == null || carColor == null || engine == null || wheel == null) {
            throw new IllegalArgumentException();
        }

        return new Car(type, carColor, engine, wheel);
    }

}
