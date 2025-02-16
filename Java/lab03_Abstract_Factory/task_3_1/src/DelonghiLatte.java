public class DelonghiLatte extends Latte {
    protected double machineCost = 15000;

    protected double machineUsageCost = 75;

    protected DelonghiLatte(int volume) {
        super(volume);
        this.drinkName = "DelonghiLatte";
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
