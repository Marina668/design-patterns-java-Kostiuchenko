public class TeaMachine implements DrinkMachine{
    @Override
    public Drink makeDrink(int volume) {
        return new Tea(volume);
    }
}
