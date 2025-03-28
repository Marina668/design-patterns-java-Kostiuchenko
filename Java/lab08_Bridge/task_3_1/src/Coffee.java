public class Coffee extends Beverage {
    public Coffee(int sugar, Topping topping, PackingType packingType) {
        super(sugar, topping, packingType);
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee...");
        if (sugar > 0) System.out.printf("Put some sugar: %s pieces ...%n", sugar);
        System.out.printf("Put some %s : %s ml...%n", topping.getToppingName(), topping.getToppingVolume());
    }

    @Override
    public void drink() {
        System.out.println("Drinking:  coffee + " + this.topping.getToppingName());
        System.out.println("Type order: " + packingType.getPackingType());
    }

    @Override
    public double cost() {
        return 10 + super.cost();
    }
}
