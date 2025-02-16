public class Espresso extends Drink {
    double coffeeBeansPrice = 20.5;

    double machineCost;

    double machineUsageCost;

    public Espresso(int volume) {
        super(volume);
        this.ingredientsPrice.add(coffeeBeansPrice);
        setDrinkPrice();
        this.drinkName = "Espresso";
    }

    public double getMachineCost(){
        return machineCost;
    }

    public double getMachineUsageCost(){
        return machineUsageCost;
    }
}
