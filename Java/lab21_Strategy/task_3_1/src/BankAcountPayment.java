public class BankAcountPayment implements Strategy {
    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of $" + amount + " made from bank account.");
    }
}
