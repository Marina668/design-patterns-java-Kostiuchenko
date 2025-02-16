public class DelonghiEspresso extends Espresso {

    protected double machineCost = 15000;

    protected double machineUsageCost = 75;

    protected DelonghiEspresso(int volume) {
        super(volume);
        this.drinkName = "DelonghiEspresso";
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
