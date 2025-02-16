public class Americano extends Drink {
    double coffeBeansPrice = 50.6;
    double sugarPrice = 33.3;

    double machineCost;

    double machineUsageCost;
    String drinkName;
    public Americano(int volume) {
        super(volume);
        this.ingredientsPrice.add(coffeBeansPrice);
        this.ingredientsPrice.add(sugarPrice);
        setDrinkPrice();
        this.drinkName = "Americano";
    }

    public double getMachineCost(){
        return machineCost;
    }

    public double getMachineUsageCost(){
        return machineUsageCost;
    }
}