import java.util.List;


public class CarSimulator {
    private final Car car;
    private final CarBuilder carBuilder;

    public CarSimulator() {
        this.car = new Car();
        Engine engine = this.car.getEngine();
        List<Wheel> wheels = this.car.getWheels();

        this.carBuilder = new CarBuilder(wheels, engine, this.car);
    }

    public static void main(String[] args) {
        CarSimulator carSimulator = new CarSimulator();

        System.out.println(carSimulator.car.getCar());
        System.out.println(carSimulator.carBuilder.getCarBuild());
    }
}