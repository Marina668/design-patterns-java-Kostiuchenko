public class Calculator {

    Strategy operand;

    void setOperand(Strategy operand) {
        this.operand = operand;
    }
    public int calculate(int a, int b){
        return operand.calculate(a, b);
    }
}
