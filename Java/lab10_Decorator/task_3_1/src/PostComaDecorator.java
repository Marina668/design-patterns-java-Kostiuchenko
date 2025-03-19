public class PostComaDecorator extends BaseDecorator{
    public PostComaDecorator(Printable wrappee) {
        super(wrappee);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(",");
    }
}
