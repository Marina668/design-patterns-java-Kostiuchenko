package ClassicImplementation;

import java.util.Stack;

public class Caretaker {

    private final Triangle triangle;

    private final Stack<Triangle.Memento> history = new Stack<>();

    public Caretaker(Triangle triangle) {
        this.triangle = triangle;
    }

    public void setA(float a) {
        history.push(triangle.save());
        triangle.setA(a);
    }

    public void setB(float b) {
        history.push(triangle.save());
        triangle.setB(b);
    }

    public void setC(float c) {
        history.push(triangle.save());
        triangle.setC(c);
    }


    public void undo(){
        if(history.empty()){
            return;
        }
        triangle.restore(history.pop());
    }

    public boolean isHistoryEmpty() {
        return history.empty();
    }
}
