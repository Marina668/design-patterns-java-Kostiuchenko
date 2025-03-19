public class Main {

    public static void main(String[] args) {
        Printable hello = new PrintableString("");
        hello = new PreWordDecorator(hello,"Hello");
        hello = new PostComaDecorator(hello);
        hello = new PostSpaceDecorator(hello);
        hello = new PostWordDecorator(hello,"World");
        hello = new PostExclaimDecorator(hello);
        hello = new PostEndlDecorator(hello);
        hello.print();
    }

}
