public class PreWordDecorator extends BaseDecorator{
    private final String word;
    public PreWordDecorator  (Printable wrappee, String word) {
        super(wrappee);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.println(word);
        super.print();
    }
}

