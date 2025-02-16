public class Equation implements ClonableEquation{
    public final double b;
    public final double c;

    public Equation(double b, double c) {
        this.b = b;
        this.c = c;
    }

    protected Equation(Equation equation) {
        b = equation.b;
        c = equation.c;
    }

    public double[] solve() {
        if (b == 0 && c!= 0) {
            throw new ArithmeticException("Equation has no solution");
        }
        if (b == 0) {
            throw new ArithmeticException("Equation has infinite number of solutions");
        }
        return new double[] { -c / b };
    }


    public String toString() {
        return String.format("%.0fx + %.0f = 0", b, c);
    }

    @Override
    public Equation copy() {
        return new Equation(this);
    }
}
