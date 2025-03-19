public class Sugar extends Topping{
    public Sugar(Beverage wrappee) {
        super(wrappee);
    }

    @Override
    public String description() {
        return super.description() + " sugar";
    }

    @Override
    public float cost() {
        return super.cost() + 1.0f;
    }
}