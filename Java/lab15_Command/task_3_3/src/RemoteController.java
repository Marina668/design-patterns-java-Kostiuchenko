public class RemoteController {

    private Command commandOn;
    private Command commandOff;
    private Command commandVolumeUp;
    private Command commandVolumeDown;
    private Command commandNextChannel;
    private Command commandPrevChannel;
    void deviceOn(){
        if (commandOn != null) {
            commandOn.execute();
        }
    }
    void deviceOff(){
        if (commandOff != null) {
            commandOff.execute();
        }
    }
    void deviceVolumeUp(){
        if(commandVolumeUp != null){
            commandVolumeUp.execute();
        }
    }
    void deviceVolumeDown(){
        if(commandVolumeDown != null){
            commandVolumeDown.execute();
        }
    }
    void deviceNextChanel(){
        if(commandNextChannel != null){
            commandNextChannel.execute();
        }
    }
    void devicePrevChanel(){
        if(commandPrevChannel != null){
            commandPrevChannel.execute();
        }
    }

    public void setCommandPrevChannel(Command commandPrevChannel) {
        this.commandPrevChannel = commandPrevChannel;
    }

    public void setCommandNextChannel(Command commandNextChannel) {
        this.commandNextChannel = commandNextChannel;
    }

    public void setCommandVolumeDown(Command commandVolumeDown) {
        this.commandVolumeDown = commandVolumeDown;
    }

    public void setCommandVolumeUp(Command commandVolumeUp) {
        this.commandVolumeUp = commandVolumeUp;
    }

    public void setCommandOff(Command commandOff) {
        this.commandOff = commandOff;
    }

    public void setCommandOn(Command commandOn) {
        this.commandOn = commandOn;
    }

    public Command getCommandON() {
        return commandOn;
    }

    public Command getCommandOff() {
        return commandOff;
    }

    public Command getCommandVolumeUp() {
        return commandVolumeUp;
    }

    public Command getCommandVolumeDown() {
        return commandVolumeDown;
    }

    public Command getCommandNext() {
        return commandNextChannel;
    }

    public Command getCommandPrev() {
        return commandPrevChannel;
    }
}
