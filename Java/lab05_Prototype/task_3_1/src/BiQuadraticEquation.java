import static java.lang.Math.sqrt;

public class BiQuadraticEquation extends Equation{
    private final double a;

    public BiQuadraticEquation(double a, double b, double c) {
        super(b, c);
        this.a = a;
    }

    public BiQuadraticEquation(BiQuadraticEquation other) {
        super(other);
        this.a = other.a;
    }

    @Override
    public double[] solve() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    throw new ArithmeticException("Equation has infinite number of solutions");
                }
                throw new ArithmeticException("Equation has no solution");
            }
            if (-c / b < 0) {
                throw new ArithmeticException("Equation has no solution");
            }
            if (-c / b == 0) {
                return new double[]{0.0};
            }
            return new double[]{sqrt(-c / b), -sqrt(-c / b)};

        }
        else {
            double d = b * b - 4 * a * c;
            if (d < 0) {
                throw new ArithmeticException("Equation has no solution");
            } else if (d == 0) {
                double y = -b / (2 * a);
                if (y < 0) {
                    throw new ArithmeticException("Equation has no solution");
                } else if (y == 0) {
                    return new double[]{0.0};
                } else {
                    return new double[]{sqrt(y), -sqrt(y)};
                }
            } else {
                double y1 = (-b + sqrt(d)) / (2 * a);
                double y2 = (-b - sqrt(d)) / (2 * a);
                if (y1 < 0 && y2 < 0)
                    throw new ArithmeticException("Equation has no solution");
                if (y1 >= 0) {
                    if (y1 == 0) {
                        return new double[]{sqrt(y1)};
                    } else {
                        return new double[]{sqrt(y1), -sqrt(y1)};
                    }
                }
                if (y2 >= 0) {
                    if (y2 == 0) {
                        return new double[]{sqrt(y2)};
                    } else {
                        return new double[]{sqrt(y2), -sqrt(y2)};
                    }
                }
            }
        }
        return new double[]{};
    }

    @Override
    public BiQuadraticEquation copy() {
        return new BiQuadraticEquation(this);
    }

    @Override
    public String toString() {
        return String.format("%.0fx^4 + %.0fx^2 + %.0f = 0", a, b, c);
    }
}
