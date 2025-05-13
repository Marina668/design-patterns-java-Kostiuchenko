public class SetSideCommand implements Command {
    private final Triangle triangle;
    private final float sideLength;
    private final char side;

    public SetSideCommand(Triangle triangle, float sideLength, char side) {
        this.triangle = triangle;
        this.sideLength = sideLength;
        this.side = side;
    }

    @Override
    public void execute() {
        switch (side) {
            case 'a' -> triangle.setA(sideLength);
            case 'b' -> triangle.setB(sideLength);
            case 'c' -> triangle.setC(sideLength);
        }
    }
}
