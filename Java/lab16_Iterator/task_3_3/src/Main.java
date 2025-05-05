import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        final Box root = new Box(-999);

        for (int j = 0; j < 10; j++) {
            final Box box = new Box(j);
            root.add(box);
            for (int i = 0; i < 10; i++) {

                String name = String.format("Item_%s", j * 10 + i);
                int value = random.nextInt(1000);
                final Item item = new Item(name, value);
                box.add(item);
            }
        }

        System.out.println("DFS:");
        Item minDFS = Analyzer.findMin(new DFSIterator(root));
        Item maxDFS = Analyzer.findMax(new DFSIterator(root));
        System.out.println("Min: " + minDFS);
        System.out.println("Max: " + maxDFS);

        System.out.println("\nBFS:");
        Item minBFS = Analyzer.findMin(new BFSIterator(root));
        Item maxBFS = Analyzer.findMax(new BFSIterator(root));
        System.out.println("Min: " + minBFS);
        System.out.println("Max: " + maxBFS);

    }
}
