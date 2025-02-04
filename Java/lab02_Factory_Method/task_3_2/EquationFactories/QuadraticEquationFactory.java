package EquationFactories;

import Equations.Equation;
import Equations.QuadraticEquation;

public class QuadraticEquationFactory implements EquationFactory{
    private Equation equation;

    @Override
    public Equation createEquation(String[] coefficients) {
        if (coefficients.length != 3) {
            throw new IllegalArgumentException("The number of coefficients must be 3");
        }
        if (equation == null)
            System.out.println("Creating QuadraticEquation: " + coefficients[0] + "x^2 + " + coefficients[1] + "x + " + coefficients[2] + " = 0");
        return new QuadraticEquation(coefficients);
    }
}
