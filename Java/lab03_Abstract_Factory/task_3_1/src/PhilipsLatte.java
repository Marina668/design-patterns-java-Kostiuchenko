public class PhilipsLatte extends Latte {
    protected double machineCost = 22000;

    protected double machineUsageCost = 100;

    protected PhilipsLatte(int volume) {
        super(volume);
        this.drinkName = "PhilipsLatte";
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
