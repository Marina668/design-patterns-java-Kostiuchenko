public interface Employee {

    int getSalary();

    void accept(SalaryVisitor visitor);

}
