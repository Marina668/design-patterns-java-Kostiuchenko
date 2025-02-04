import EquationFactories.LinearEquationFactory;
import EquationFactories.QuadraticEquationFactory;
import EquationFactories.BiQuadraticEquationFactory;
import Equations.Equation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static double getGreatestRoot(double[] roots) {
        double greatestRoot = Double.MIN_VALUE;
        for (double root : roots) {
            if (root > greatestRoot) {
                greatestRoot = root;
            }
        }
        return greatestRoot;
    }

    public static double getSmallestRoot(double[] roots) {
        double smallestRoot = Double.MAX_VALUE;
        for (double root : roots) {
            if (root < smallestRoot) {
                smallestRoot = root;
            }
        }
        return smallestRoot;
    }

    public static void getNumberOfSolutions(double[] roots) {
        if (roots.length == 1) {
            System.out.println("One solution: " + roots[0]);
        } else if (roots.length == 2) {
            System.out.println("Two solutions: " + roots[0] + " " + roots[1]);
        } else if (roots.length == 3) {
            System.out.println("Three solutions: " + roots[0] + " " + roots[1] + " " + roots[2]);
        } else if (roots.length == 4) {
            System.out.println("Four solutions: " + roots[0] + " " + roots[1] + " " + roots[2] + " " + roots[3]);
        } else {
            throw new IllegalArgumentException("Wrong number of roots");
        }
    }

    public static void main(String[] args) {

        File directory = new File("./");
        System.out.println(directory.getAbsolutePath());

        LinearEquationFactory linearEquationFactory = new LinearEquationFactory();
        QuadraticEquationFactory quadraticEquationFactory = new QuadraticEquationFactory();
        BiQuadraticEquationFactory biQuadraticEquationFactory = new BiQuadraticEquationFactory();


        double greatestRoot = Double.MIN_VALUE;
        double smallestRoot = Double.MAX_VALUE;
        Equation equationWithGreatestRoot = null;
        Equation equationWithSmallestRoot = null;

        System.out.println("input01.txt");
        try (FileReader fileReader = new FileReader("input01.txt")) {
            BufferedReader buffer = new BufferedReader(fileReader);
            String line;

            while ((line = buffer.readLine()) != null) {
                String[] coefficients = line.trim().split("\\s+");
                if (coefficients.length == 1 && coefficients[0].equals("")) {
                    System.out.println("Skipping empty line");
                    continue;
                }
                try {
                    Equation equation;
                    switch (coefficients.length) {
                        case 2 -> equation = linearEquationFactory.createEquation(coefficients);
                        case 3 -> equation = quadraticEquationFactory.createEquation(coefficients);
                        case 5 -> equation = biQuadraticEquationFactory.createEquation(coefficients);
                        default -> throw new IllegalArgumentException("Wrong number of coefficients: " +
                                coefficients.length + " in line: " + String.join(" ", coefficients));
                    }

                    assert equation != null;

                    double[] roots = equation.solve();

                    if (roots.length == 1) {
                        double greatestRootInEquation = getGreatestRoot(roots);
                        double smallestRootInEquation = getSmallestRoot(roots);
                        if (greatestRootInEquation > greatestRoot) {
                            greatestRoot = greatestRootInEquation;
                            equationWithGreatestRoot = equation;
                        }
                        if (smallestRootInEquation < smallestRoot) {
                            smallestRoot = smallestRootInEquation;
                            equationWithSmallestRoot = equation;
                        }
                    }

                    getNumberOfSolutions(roots);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Equation with greatest root: " + equationWithGreatestRoot + " with root: " + greatestRoot);
        System.out.println("Equation with smallest root: " + equationWithSmallestRoot + " with root: " + smallestRoot);
        System.out.println();
    }
}
