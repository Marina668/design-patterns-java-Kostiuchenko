public class IncreaseSalaryVisitor implements SalaryVisitor {
    @Override
    public void visit(Manager manager) {
        //підвищує зарплату на 10%
        int salary = manager.getSalary();
        salary *= 1.1;
        manager.setSalary(salary);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        //підвищує зарплату на 5%
        int salary = salesPerson.getSalary();
        salary *= 1.05;
        salesPerson.setSalary(salary);
    }

    @Override
    public void visit(Programmer programmer) {
        //підвищує зарплату на 30%
        int salary = programmer.getSalary();
        salary *= 1.3;
        programmer.setSalary(salary);
    }
}
