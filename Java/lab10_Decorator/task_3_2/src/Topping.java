public class Topping extends Beverage{
    private final Beverage wrappee;

    public Topping(Beverage wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String description() {
        return wrappee.description();
    }

    @Override
    public float cost() {
        return wrappee.cost();
    }
}
