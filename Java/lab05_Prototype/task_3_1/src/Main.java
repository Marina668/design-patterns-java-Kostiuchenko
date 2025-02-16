import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Equation> equations = new ArrayList<>();
        equations.add(new Equation(9, 4));
        equations.add(new QuadraticEquation(-8, -5, 46));
        equations.add(new BiQuadraticEquation(18, 33, 68));
        for (Equation equation : equations) {
            System.out.println(equation);
        }

        List<Equation> equationsCopy = new ArrayList<>();
        for (Equation equation : equations) {
            Equation equationCopy = equation.copy();
            equationsCopy.add(equationCopy);
        }

        System.out.println("==== Copies ====");
        for (Equation equation : equationsCopy) {
            System.out.println(equation);
        }
    }
}
