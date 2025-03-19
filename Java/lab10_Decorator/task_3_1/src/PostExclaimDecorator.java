public class PostExclaimDecorator extends BaseDecorator{
    public PostExclaimDecorator (Printable wrappee) {
        super(wrappee);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("!");
    }
}
