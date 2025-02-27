public class Chocolate extends Beverage {
    public Chocolate(int sugar, Topping topping, PackingType packingType) {
        super(sugar, topping, packingType);
    }

    @Override
    public void prepare() {
        System.out.println("Put some cacao...");
        if (sugar > 0) System.out.printf("Put some sugar: %s pieces ...%n", sugar);
        System.out.printf("Put some %s : %s ml...%n", topping.getToppingName(), topping.getToppingVolume());
    }

    @Override
    public void drink() {
        System.out.println("Drinking:  chocolate + " + this.topping.getToppingName());
        System.out.println("Type order: " + packingType.getPackingType());
    }

    @Override
    public double cost() {
        return 15 + super.cost();
    }
}
