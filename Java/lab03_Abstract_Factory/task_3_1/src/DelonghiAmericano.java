public class DelonghiAmericano extends Americano{
    protected double machineCost = 15000;

    protected double machineUsageCost = 75;

    protected DelonghiAmericano(int volume) {
        super(volume);
        this.drinkName = "DelonghiAmericano";
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
