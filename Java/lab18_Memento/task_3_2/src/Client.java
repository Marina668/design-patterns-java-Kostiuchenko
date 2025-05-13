import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(6, 3, 4);
        Caretaker caretaker = new Caretaker(triangle);
        List<Command> commands = new ArrayList<>();

        String[] edges = {
                "b",
                "c",
                "a",
                "duplicateA",
                "c",
                "b",
                "halfA"
        };

        float[] values = {
                4,
                5,
                4,
                1, // "duplicateA",
                6,
                3,
                1, // "halfA"
        };

        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a" -> commands.add(new SetSideCommand(triangle, values[index], 'a'));
                case "b" -> commands.add(new SetSideCommand(triangle, values[index], 'b'));
                case "c" -> commands.add(new SetSideCommand(triangle, values[index], 'c'));
                case "duplicateA" -> commands.add(new DublicateCommand(triangle, 'a'));
                case "duplicateB" -> commands.add(new DublicateCommand(triangle, 'b'));
                case "duplicateC" -> commands.add(new DublicateCommand(triangle, 'c'));
                case "halfA" -> commands.add(new HalfCommand(triangle, 'a'));
                case "halfB" -> commands.add(new HalfCommand(triangle, 'b'));
                case "halfC" -> commands.add(new HalfCommand(triangle, 'c'));
            }
        }

        for (Command command : commands) {
            caretaker.setCommand(command);
            caretaker.executeCommand();
            System.out.println("Volume = " + triangle.square());
        }

        System.out.println("=====The smallest triangle====");
        float smallestSquare = triangle.square();
        Triangle.Memento smallestMemento = triangle.save();
        while(!caretaker.isHistoryEmpty()){
            caretaker.undo();
            float square = triangle.square();
            if(square < smallestSquare){
                smallestSquare = square;
                smallestMemento = triangle.save();
            }
        }
        triangle.restore(smallestMemento);
        System.out.println("Volume = " + smallestSquare);

    }

}
