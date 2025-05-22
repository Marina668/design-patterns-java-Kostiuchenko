public class  Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperand(new Add());
        calculator.calculate(22, 33);

        calculator.setOperand(new Subtract());
        calculator.calculate(12, 13);

        calculator.setOperand(new Multiply());
        calculator.calculate(11, 12);
    }

}
