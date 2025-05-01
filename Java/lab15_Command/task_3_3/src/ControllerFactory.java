import java.util.ArrayList;

public class ControllerFactory {
    public RemoteController getSimpleController(Device device){
        Command commandOn = new CommandOn(device);
        Command commandOff = new CommandOff(device);
        Command commandVolumeUp = new CommandVolumeUp(device);
        Command commandVolumeDown = new CommandVolumeDown(device);
        Command commandNextChannel = new CommandNextChannel(device);
        Command commandPrevChannel = new CommandPrevChannel(device);

        RemoteController controller = new RemoteController();
        controller.setCommandOn(commandOn);
        controller.setCommandOff(commandOff);
        controller.setCommandVolumeUp(commandVolumeUp);
        controller.setCommandVolumeDown(commandVolumeDown);
        controller.setCommandNextChannel(commandNextChannel);
        controller.setCommandPrevChannel(commandPrevChannel);

        return controller;
    }


    public RemoteController getUniversalController(ArrayList<Device> devices){
        RemoteController controllerUniversal = getSimpleController(devices.get(0));

        for(int i = 1; i< devices.size(); i++){
            Device device = devices.get(i);
            controllerUniversal.getCommandNext().addDevice(device);
            controllerUniversal.getCommandOff().addDevice(device);
            controllerUniversal.getCommandON().addDevice(device);
            controllerUniversal.getCommandVolumeDown().addDevice(device);
            controllerUniversal.getCommandVolumeUp().addDevice(device);
            controllerUniversal.getCommandPrev().addDevice(device);

        }

        return controllerUniversal;
    }
}
