package Equations;

public class Equation {
    protected String[] coefficients;

    public Equation(String[] coefficients) {
        this.coefficients = coefficients;
    }

    public double[] solve() {
        double b = Double.parseDouble(coefficients[coefficients.length-2]);
        double c = Double.parseDouble(coefficients[coefficients.length-1]);
        if (b == 0 && c!= 0) {
            throw new ArithmeticException("Equation has no solution");
        }
        if (b == 0) {
            throw new ArithmeticException("Equation has infinite number of solutions");
        }
        return new double[] { -c / b };
    }
}
