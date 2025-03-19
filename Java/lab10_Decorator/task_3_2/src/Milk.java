public class Milk extends Topping{
    public Milk(Beverage wrappee) {
        super(wrappee);
    }

    @Override
    public String description() {
        return super.description() + " milk";
    }

    @Override
    public float cost() {
        return super.cost() + 2.5f;
    }
}
