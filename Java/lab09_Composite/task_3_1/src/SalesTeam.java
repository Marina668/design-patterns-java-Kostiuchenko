import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Accounting {
    private final String departmentName;

    private final List<Accounting> employees = new ArrayList<>();


    public SalesTeam(String departmentName) {
        this.departmentName = departmentName;
    }

    void addEmployee(Accounting employee) {
        employees.add(employee);
    }


    @Override
    public void payExpenses() {
        System.out.println("\nDepartment: "+departmentName);
        for (Accounting employee : employees) {
            employee.payExpenses();
        }

    }

}