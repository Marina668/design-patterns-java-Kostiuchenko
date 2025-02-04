
public class Latte extends Drink {
    double coffeeBeansPrice = 15.55;
    double milkPrice = 34.5;

    public Latte(int volume) {
        super(volume);
        this.ingredientsPrice.add(coffeeBeansPrice);
        this.ingredientsPrice.add(milkPrice);
        setDrinkPrice();
        this.drinkName = "Latte";

    }
}
