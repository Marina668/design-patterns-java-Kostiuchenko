public class ExpensesClient {

  public static void main(String[] args) {
    Supermarket supermarket = new Supermarket(3);
    supermarket.hire_people();
    supermarket.payExpenses();
  }
}