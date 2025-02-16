public class Latte extends Drink {
    double coffeeBeansPrice = 15.55;
    double milkPrice = 34.5;

    double machineCost;

    double machineUsageCost;
    public Latte(int volume) {
        super(volume);
        this.ingredientsPrice.add(coffeeBeansPrice);
        this.ingredientsPrice.add(milkPrice);
        setDrinkPrice();
        this.drinkName = "Latte";

    }

    public double getMachineCost(){
        return machineCost;
    }

    public double getMachineUsageCost(){
        return machineUsageCost;
    }
}
