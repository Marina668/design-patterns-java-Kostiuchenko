public class HalfCommand implements Command {
    private final Triangle triangle;
    private final char side;

    public HalfCommand(Triangle triangle, char side) {
        this.triangle = triangle;
        this.side = side;
    }

    @Override
    public void execute() {
        switch (side) {
            case 'a' -> triangle.halfA();
            case 'b' -> triangle.halfB();
            case 'c' -> triangle.halfC();
        }
    }
}
