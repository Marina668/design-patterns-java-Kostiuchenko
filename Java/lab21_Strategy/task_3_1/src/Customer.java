public class Customer {

  Strategy payment;

  void setPayment(Strategy payment) {
    this.payment = payment;
  }

  public void makePayment(int amount) {
    if (payment == null) {
      throw new IllegalArgumentException("Payment type is not set");
    }
    payment.makePayment(amount);
  }
}
