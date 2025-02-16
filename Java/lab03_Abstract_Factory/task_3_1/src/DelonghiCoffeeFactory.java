public class DelonghiCoffeeFactory implements CoffeeFactory {
    @Override
    public Espresso createEspresso(int volume) {
        return new DelonghiEspresso(volume);
    }

    @Override
    public Latte createLatte(int volume) {
        return new DelonghiLatte(volume);
    }

    @Override
    public Americano createAmericano(int volume) {
        return new DelonghiAmericano(volume);}
}
