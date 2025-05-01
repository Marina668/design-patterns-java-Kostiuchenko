import java.util.ArrayList;

public class CommandNextChannel implements Command {
    private final ArrayList<Device> devices = new ArrayList<>();

    public CommandNextChannel(Device device) {
        devices.add(device);
    }

    @Override
    public void addDevice(Device device) {
        if (!devices.contains(device)) {
            devices.add(device);
        }
    }

    @Override
    public void execute() {
        for (Device device : devices) {
            device.nextChanel();
        }

    }
}
