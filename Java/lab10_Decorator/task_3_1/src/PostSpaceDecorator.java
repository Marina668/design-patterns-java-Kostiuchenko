public class PostSpaceDecorator extends BaseDecorator{
    public PostSpaceDecorator(Printable wrappee) {
        super(wrappee);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" ");
    }
}

