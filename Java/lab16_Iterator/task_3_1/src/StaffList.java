import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaffList implements Iterable<Employee> {

    public StaffList(Employee...employees) {
        this.employees.addAll(List.of(employees));
    }

    private final List<Employee> employees = new ArrayList<>();

    List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }


    @Override
    public Iterator<Employee> iterator() {
        return new StaffListIterator(this);
    }
}
