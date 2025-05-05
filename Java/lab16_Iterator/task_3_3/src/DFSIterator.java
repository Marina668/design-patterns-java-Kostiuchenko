import java.util.*;

public class DFSIterator implements Iterator<Component> {

    private final Deque<Component> stack = new ArrayDeque<>();

    public DFSIterator(Component root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Component next() {
        Component current = stack.pop();
        if (current instanceof Box) {
            List<Component> children = ((Box) current).getChildren();
            ListIterator<Component> it = children.listIterator(children.size());
            while (it.hasPrevious()) {
                stack.push(it.previous());
            }
        }
        return current;
    }
}
