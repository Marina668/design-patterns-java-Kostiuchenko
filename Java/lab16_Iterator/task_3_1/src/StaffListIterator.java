import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StaffListIterator implements Iterator<Employee> {

    private final List<Employee> collection;
    private int iterationState;

    public StaffListIterator(StaffList collection) {
        this.collection = collection.getEmployees();
        this.collection.sort(Comparator.comparing(Employee::getName));
        this.iterationState = 0;
    }

    @Override
    public boolean hasNext() {
        return iterationState < collection.size();
    }

    @Override
    public Employee next() {
        return collection.get(iterationState++);
    }
}
