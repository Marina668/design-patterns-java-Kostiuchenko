public class PhilipsCoffeeFactory implements CoffeeFactory {
    @Override
    public Espresso createEspresso(int volume) {
        return new PhilipsEspresso(volume);
    }

    @Override
    public Latte createLatte(int volume) {
        return new PhilipsLatte(volume);
    }

    @Override
    public Americano createAmericano(int volume) {
        return new PhilipsAmericano(volume);}
}
