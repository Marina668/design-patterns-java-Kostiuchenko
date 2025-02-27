public class Cafe {

    public static void main(String[] args) {
        Chocolate milkChocolate = new Chocolate(3, new Milk(200), new AtRestaurant());
        Coffee coffeeWithMilk = new Coffee(3, new Milk(200), new ForTakeout());
        Tea blackTea = new Tea(0, new Water(300), new AtRestaurant());

        beverageInfo(milkChocolate);
        beverageInfo(coffeeWithMilk);
        beverageInfo(blackTea);
    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }

}
