package EquationFactories;

import Equations.BiQuadraticEquation;
import Equations.Equation;

public class BiQuadraticEquationFactory implements EquationFactory {
    private Equation equation;

    @Override
    public Equation createEquation(String[] coefficients) {
        if (coefficients.length != 5) {
            throw new IllegalArgumentException("The number of coefficients must be 5");
        }
        if (equation == null)
            System.out.println("Creating BiQuadraticEquation: " + coefficients[0] + "x^4 + " + coefficients[2] + "x^2 + " + coefficients[4] + " = 0");
        return new BiQuadraticEquation(coefficients);
    }
}
