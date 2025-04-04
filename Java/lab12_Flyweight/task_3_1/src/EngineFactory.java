import java.util.HashMap;

public class EngineFactory {
    private final HashMap<String, Engine> engineCash = new HashMap<>();

    public EngineFactory() {
    }

    public Engine getEngine(int power, Engine.Fuel fuelType) {
        String key = power + "_" + fuelType;
        Engine engine = engineCash.get(key);

        if (engine == null) {
            engine = new Engine(power, fuelType);
            engineCash.put(key, engine);
            return engine;
        }
        return engine;
    }
}
