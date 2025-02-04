package EquationFactories;

import Equations.Equation;

public class LinearEquationFactory implements EquationFactory{
    private Equation equation;

    @Override
    public Equation createEquation(String[] coefficients) {
        if (coefficients.length != 2) {
            throw new IllegalArgumentException("The number of coefficients must be 2");
        }
        if (equation == null)
            System.out.println("Creating LinearEquation: " + coefficients[0] + "x + " + coefficients[1] + " = 0");
        return new Equation(coefficients);
    }
}
