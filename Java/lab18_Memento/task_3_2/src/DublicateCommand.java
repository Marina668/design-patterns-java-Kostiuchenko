public class DublicateCommand implements Command {
    private final Triangle triangle;
    private final char side;

    public DublicateCommand(Triangle triangle, char side) {
        this.triangle = triangle;
        this.side = side;
    }

    @Override
    public void execute() {
        switch (side) {
            case 'a' -> triangle.duplicateA();
            case 'b' -> triangle.duplicateB();
            case 'c' -> triangle.duplicateC();
        }
    }
}
