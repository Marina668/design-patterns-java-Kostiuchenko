import java.util.ArrayList;
import java.util.Random;

public class Supermarket implements Accounting {
    public Supermarket(int employeeNumber) {
        employee_number = employeeNumber;
    }

    private final String[] departments = {"Meat", "Milk", "Confectionery"};
    private final String[] employees_names = {"Elijah", "Amelia", "James", "Sophia",
            "Liam", "Olivia", "Noah", "Emma", "Oliver", "Charlotte"};

    private final int employee_number;
    private final ArrayList<Accounting> salesDepartments = new ArrayList<>();

    public void hire_people() {
        Random random = new Random();
        int id = random.nextInt(employees_names.length);
        Manager director = new Manager(employees_names[id] + " (director)", random.nextInt(15_000, 30_000));
        salesDepartments.add(director);

        for (String dep_name : departments) {
            SalesTeam salesTeam = new SalesTeam(dep_name);
            id = random.nextInt(employees_names.length);
            Manager manager = new Manager(employees_names[id], random.nextInt(8_000, 15_000));
            salesTeam.addEmployee(manager);
            for (int i = 0; i < employee_number; i++) {
                id = random.nextInt(employees_names.length);
                Salesperson salesperson = new Salesperson(employees_names[id],
                        random.nextInt(4_000, 7_000), manager);
                salesTeam.addEmployee(salesperson);
            }
            salesDepartments.add(salesTeam);
        }
    }

    @Override
    public void payExpenses() {
        System.out.println("Paying salary in supermarket...\n");
        for (Accounting dep : salesDepartments) {
            dep.payExpenses();
        }

    }
}