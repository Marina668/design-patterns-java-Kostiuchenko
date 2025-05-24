public class FineSalaryVisitor implements SalaryVisitor {
    @Override
    public void visit(Manager manager) {
        //штраф 20%
        int salary = manager.getSalary();
        salary *= 0.8;
        manager.setSalary(salary);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        //штраф 15%
        int salary = salesPerson.getSalary();
        salary *= 0.85;
        salesPerson.setSalary(salary);
    }
    @Override
    public void visit(Programmer programmer) {
        //штраф 25%
        int salary = programmer.getSalary();
        salary *= 0.75;
        programmer.setSalary(salary);
    }
}
