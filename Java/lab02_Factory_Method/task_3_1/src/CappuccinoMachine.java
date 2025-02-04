
public class CappuccinoMachine implements DrinkMachine{
    @Override
    public Drink makeDrink(int volume) {
        return new Cappuccino(volume);
    }
}
