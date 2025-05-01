import java.util.ArrayList;

public class CommandVolumeUp implements Command {
    private final ArrayList<Device> devices = new ArrayList<>();

    public CommandVolumeUp(Device device) {
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
            device.volumeUp();
        }

    }
}