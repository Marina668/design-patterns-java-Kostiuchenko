package EmptyInterface;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        Caretaker caretaker = new Caretaker(triangle);

        String[] edges = {
                "b",
                "c",
                "a",
                "c",
                "b",
        };

        float[] values = {
                4,
                5,
                4,
                2,
                3,
        };

        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a" -> caretaker.setA(values[index]);
                case "b" -> caretaker.setB(values[index]);
                case "c" -> caretaker.setC(values[index]);
            }

            System.out.println("Volume = " + triangle.square());
        }

        System.out.println("=====The largest triangle====");
        float largestSquare = triangle.square();
        Memento largestMemento = triangle.save();
        while(!caretaker.isHistoryEmpty()){
            caretaker.undo();
            float square = triangle.square();
            if(square > largestSquare){
                largestSquare = square;
                largestMemento = triangle.save();
            }
        }
        triangle.restore(largestMemento);
        System.out.println("Volume = " + largestSquare);
    }
}
