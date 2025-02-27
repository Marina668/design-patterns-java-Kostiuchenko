public abstract class Beverage {

    protected final int sugar;
    protected final Topping topping;
    protected final PackingType packingType;

    public Beverage(int sugar, Topping topping, PackingType packingType) {
        this.sugar = sugar;
        this.topping = topping;
        this.packingType = packingType;
    }

    public abstract void prepare();
    public abstract void drink();
    public double cost() {
        return topping.getToppingPrice();
    }
}
