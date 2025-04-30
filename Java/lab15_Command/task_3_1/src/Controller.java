public class Controller {

    private Command commandOn;
    private Command commandOff;

    public void setCommandOn(Command commandOn) {
        this.commandOn = commandOn;
    }
    public void setCommandOff(Command commandOff) {
        this.commandOff = commandOff;
    }


    public Command getCommandOn() {
        return commandOn;
    }

    public Command getCommandOff() {
        return commandOff;
    }

    public void on() {
        if (commandOn != null) {
            commandOn.execute();
        }
    }

    public void off() {
        if (commandOff != null) {
            commandOff.execute();
        }
    }

}
