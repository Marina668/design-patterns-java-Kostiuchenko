import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class BFSIterator implements Iterator<Component> {

    private final Queue<Component> queue = new ArrayDeque<>();

    public BFSIterator(Component root) {
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Component next() {
        Component current = queue.poll();
        if (current instanceof Box) {
            queue.addAll(((Box) current).getChildren());
        }
        return current;
    }
}
