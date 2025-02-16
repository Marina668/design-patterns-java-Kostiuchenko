public class PhilipsEspresso extends Espresso {
    protected double machineCost = 22000;

    protected double machineUsageCost = 100;

    protected PhilipsEspresso(int volume) {
        super(volume);
        this.drinkName = "PhilipsEspresso";
    }

    @Override
    public double getMachineCost(){
        return machineCost;
    }

    @Override
    public double getMachineUsageCost(){
        return machineUsageCost;
    }
}
