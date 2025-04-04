import java.util.HashMap;

public class WheelFactory {
    private final HashMap<Integer, Wheel> wheelCash = new HashMap<>();

    public WheelFactory() {
    }

    public Wheel getWheel(int diameter) {
        Wheel wheel = wheelCash.get(diameter);

        if (wheel == null) {
            wheel = new Wheel(diameter);
            wheelCash.put(diameter, wheel);
            return wheel;
        }
        return wheel;
    }
}
