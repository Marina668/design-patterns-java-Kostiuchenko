
public class Espresso extends Drink {
    double coffeeBeansPrice = 20.5;

    public Espresso(int volume) {
        super(volume);
        this.ingredientsPrice.add(coffeeBeansPrice);
        setDrinkPrice();
        this.drinkName = "Espresso";
    }
}
