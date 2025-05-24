public class Client {

    public static void main(String[] args) {
        StaffList staffList = new StaffList();

        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new SalesPerson(40000));
        staffList.addEmployee(new Programmer(70000));

        System.out.println("Total amount paid to staff: " + staffList.getSalary());

        staffList.accept(new IncreaseSalaryVisitor());
        System.out.println("Total amount paid to staff after increasing salary: " + staffList.getSalary());

        staffList.accept(new FineSalaryVisitor());
        System.out.println("Total amount paid to staff after imposition of a fine: " + staffList.getSalary());
    }

}
