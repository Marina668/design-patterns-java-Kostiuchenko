
public class Americano extends Drink {
    double coffeBeansPrice = 50.6;
    double sugarPrice = 33.3;
    public Americano(int volume) {
        super(volume);
        this.ingredientsPrice.add(coffeBeansPrice);
        this.ingredientsPrice.add(sugarPrice);
        setDrinkPrice();
        this.drinkName = "Americano";
    }
}
