public class ControllerFactory {
    public Controller getSimpleController(Lamp lamp){
        Command turnLightsOn = new TurnLightsOn(lamp);
        Command turnLightsOFF = new TurnLightsOff(lamp);

        Controller controller = new Controller();
        controller.setCommandOn(turnLightsOn);
        controller.setCommandOff(turnLightsOFF);

        return controller;
    }


    public Controller getUniversalController(Lamp[] lamps){
        Controller controllerUniversal = getSimpleController(lamps[0]);

        for(int i = 1; i< lamps.length; i++){
            controllerUniversal.getCommandOn().addLamp(lamps[i]);
            controllerUniversal.getCommandOff().addLamp(lamps[i]);

        }

        return controllerUniversal;
    }
}