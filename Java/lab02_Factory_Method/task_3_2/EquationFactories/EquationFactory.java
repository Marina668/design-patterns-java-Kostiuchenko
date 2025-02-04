package EquationFactories;

import Equations.Equation;

interface EquationFactory {
    Equation createEquation(String[] coefficients);
}
