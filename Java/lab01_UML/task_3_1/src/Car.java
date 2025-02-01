import java.util.Arrays;
import java.util.List;


public class Car {
    final private List<Wheel> wheels;
    final private Engine engine;

    public Car() {
        this.engine = new Engine();
        this.wheels = Arrays.asList(new Wheel(), new Wheel(), new Wheel(), new Wheel());
    }

    public String getCar() {
        return "Car";
    }

    public List<Wheel> getWheels() {return this.wheels;}
    public Engine getEngine() {return this.engine;}
}