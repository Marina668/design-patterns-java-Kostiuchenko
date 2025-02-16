public interface CoffeeFactory {
    Espresso createEspresso(int volume);
    Latte createLatte(int volume);

    Americano createAmericano(int volume);
}
