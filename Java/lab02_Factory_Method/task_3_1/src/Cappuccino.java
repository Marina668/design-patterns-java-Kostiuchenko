

public class Cappuccino extends Drink {
    double coffeeBeansPrice = 25.5;
    double milkPrice = 40.40;
    double sugarPrice = 50.5;

    public Cappuccino(int volume) {

        super(volume);
        this.ingredientsPrice.add(coffeeBeansPrice);
        this.ingredientsPrice.add(milkPrice);
        this.ingredientsPrice.add(sugarPrice);
        setDrinkPrice();
        this.drinkName = "Capuccino";
    }
}
