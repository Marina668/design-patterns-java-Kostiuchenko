import java.util.ArrayList;

public class CommandPrevChannel implements Command {
    private final ArrayList<Device> devices = new ArrayList<>();

    public CommandPrevChannel(Device device) {
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
            device.prevChanel();
        }

    }
}
