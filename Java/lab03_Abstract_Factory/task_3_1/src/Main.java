import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Espresso> espressos = new ArrayList<>();
        ArrayList<Americano> americanos = new ArrayList<>();
        ArrayList<Latte> lattes = new ArrayList<>();
        int N = 30;

        CoffeeFactory philipsFactory = new PhilipsCoffeeFactory();
        CoffeeFactory delonghiFactory = new DelonghiCoffeeFactory();
        ArrayList<CoffeeFactory> factories = new ArrayList<>();
        factories.add(philipsFactory);
        factories.add(delonghiFactory);

        Random random = new Random();

        double income = 0;

        for (CoffeeFactory factory : factories) {

            for (int i = 0; i < N; i++) {

                Espresso espresso = factory.createEspresso(random.nextInt(10) + 1);
                Americano americano = factory.createAmericano(random.nextInt(10) + 1);
                Latte latte = factory.createLatte(random.nextInt(10) + 1);

                income += espresso.getDrinkPrice() - espresso.getIngredientsPrice();
                income += americano.getDrinkPrice() - americano.getIngredientsPrice();
                income += latte.getDrinkPrice() - latte.getIngredientsPrice();
            }


            int finalCost = 0;

            

            for (Espresso espresso : espressos) {
                income += espresso.getDrinkPrice() - espresso.getIngredientsPrice();

            }



        }
    }
}
