import java.util.Stack;

public class Caretaker {
    private final Triangle triangle;
    private final Stack<Triangle.Memento> history = new Stack<>();

    private Command command ;


    public void setCommand(Command command) {
        this.command = command;
    }

    public Caretaker(Triangle triangle) {
        this.triangle = triangle;
    }

    public void executeCommand(){
        history.push(triangle.save());
        command.execute();
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
