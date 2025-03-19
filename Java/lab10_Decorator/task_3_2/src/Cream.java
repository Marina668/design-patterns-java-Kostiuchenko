public class Cream extends Topping{
    public Cream(Beverage wrappee) {
        super(wrappee);
    }

    @Override
    public String description() {
        return super.description() + " cream";
    }

    @Override
    public float cost() {
        return super.cost() + 3.0f;
    }
}
