package HardRelations;

public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        Caretaker caretaker = new Caretaker();

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
                case "a" -> {
                    caretaker.push(triangle.save());
                    triangle.setA(values[index]);
                }
                case "b" -> {
                    caretaker.push(triangle.save());
                    triangle.setB(values[index]);
                }
                case "c" -> {
                    caretaker.push(triangle.save());
                    triangle.setC(values[index]);
                }
            }

            System.out.println("Volume = " + triangle.square());
        }

        System.out.println("=====The largest triangle====");
        float largestSquare = triangle.square();
        while(!caretaker.isHistoryEmpty()){
            caretaker.undo();
            float square = triangle.square();
            if(square > largestSquare){
                largestSquare = square;
            }
        }
        System.out.println("Volume = " + largestSquare);
    }
}
