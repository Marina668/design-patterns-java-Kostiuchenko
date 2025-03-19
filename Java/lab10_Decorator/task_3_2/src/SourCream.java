public class SourCream extends Topping{

    public SourCream(Beverage wrappee) {
        super(wrappee);
    }

    @Override
    public String description() {
        return super.description() + " sour cream";
    }

    @Override
    public float cost() {
        return super.cost() + 3.5f;
    }
}