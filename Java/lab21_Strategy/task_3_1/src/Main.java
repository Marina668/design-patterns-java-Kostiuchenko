public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setPayment(new BankAcountPayment());
    customer.makePayment(100);

    customer.setPayment(new GooglePayPayment());
    customer.makePayment(200);

    customer.setPayment(new PayPalPayment());
    customer.makePayment(30);
  }

}
