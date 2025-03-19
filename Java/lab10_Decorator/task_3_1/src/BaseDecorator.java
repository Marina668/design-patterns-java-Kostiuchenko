public class BaseDecorator implements Printable{

    private final Printable wrappee;

    public BaseDecorator(Printable wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void print() {
        wrappee.print();
    }
}
