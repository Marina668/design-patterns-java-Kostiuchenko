public interface SalaryVisitor {
    void visit(Manager manager);
    void visit(SalesPerson salesPerson);

    void visit(Programmer programmer);
}
