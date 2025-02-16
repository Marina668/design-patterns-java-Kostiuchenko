public class PhilipsAmericano extends Americano {

    protected double machineCost = 22000;

    protected double machineUsageCost = 100;

    protected PhilipsAmericano(int volume) {
        super(volume);
        this.drinkName = "PhilipsAmericano";
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
