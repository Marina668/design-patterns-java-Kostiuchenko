import static java.lang.Math.sqrt;

public class QuadraticEquation extends Equation{

    private final double a;

    public QuadraticEquation(double a, double b, double c) {
        super(b, c);
        this.a = a;
    }

    public QuadraticEquation(QuadraticEquation other) {
        super(other);
        this.a = other.a;
    }

    @Override
    public double[] solve() {
        if (a == 0) {
            return super.solve();
        }
        double d = b * b - 4 * a * c;
        if (d < 0) {
            throw new ArithmeticException("Equation has no solution");
        }
        if (d == 0) {
            return new double[] { -b / (2 * a) };
        }
        else {
            return new double[]{(-b + sqrt(d)) / (2 * a), (-b - sqrt(d)) / (2 * a)};
        }
    }

    @Override
    public QuadraticEquation copy() {
        return new QuadraticEquation(this);
    }

    @Override
    public String toString() {
        return String.format("%.0fx^2 + %.0fx + %.0f = 0", a, b, c);
    }
}
