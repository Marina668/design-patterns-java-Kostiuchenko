package Equations;

import static java.lang.Math.sqrt;

public class QuadraticEquation extends Equation {
    public QuadraticEquation(String[] coefficients) {
        super(coefficients);
    }

    @Override
    public double[] solve() {
        double a = Double.parseDouble(coefficients[0]);
        double b = Double.parseDouble(coefficients[1]);
        double c = Double.parseDouble(coefficients[2]);

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
}
