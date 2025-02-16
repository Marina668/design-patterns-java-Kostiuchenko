import java.util.concurrent.locks.ReentrantLock;

public class Director {

    private Director() {}

    private static Director instance = null;
    private static ReentrantLock mutex = new ReentrantLock();
    public static Director getInstance() {
        if (instance == null){
            mutex.lock();
            if (instance == null)
                instance =  new Director();
            mutex.unlock();
        }

        return instance;
    }

    Car createSedan() {
        Engine engine = (new Engine.EngineBuilder())
                .setPower(120)
                .build();

        Wheel wheel = (new Wheel.WheelBuilder())
                .setMaterial(Wheel.Material.Forged)
                .build();

        Transmission transmission = (new Transmission.TransmissionBuilder())
                .setGearsNumber(6)
                .setType(Transmission.Type.Automatic)
                .build();

        return (new Car.CarBuilder())
                .setType(Car.Type.Sedan)
                .setEngine(engine)
                .setWheel(wheel)
                .setTransmission(transmission)
                .build();
    }

    Car createSUV() {
        Engine engine = (new Engine.EngineBuilder())
                .setFuel(Engine.Fuel.Electric)
                .setTorque(100)
                .setVolume(1.5f)
                .build();

        Wheel wheel = (new Wheel.WheelBuilder())
                .setMaterial(Wheel.Material.Forged)
                .setDiameter(15)
                .build();

        return (new Car.CarBuilder())
                .setType(Car.Type.SUV)
                .setEngine(engine)
                .setWheel(wheel)
                .setCarColor(Car.CarColor.Red)
                .build();
    }

}
