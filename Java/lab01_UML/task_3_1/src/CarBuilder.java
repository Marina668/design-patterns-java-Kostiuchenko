import java.util.ArrayList;
import java.util.List;


public class CarBuilder {
    final private List<String> carBuild = new ArrayList<>();
    public CarBuilder (List<Wheel> wheels, Engine engine, Car car){
        this.carBuild.add("Build plan:");
        for (Wheel wheel : wheels) {
            this.carBuild.add(wheel.getWheel());
        }

        this.carBuild.add(engine.getEngine());
        this.carBuild.add(car.getCar());
    }

    public List<String> getCarBuild() {
        return this.carBuild;
    }
}