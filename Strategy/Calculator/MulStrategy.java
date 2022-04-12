package Strategy.Calculator;

public class MulStrategy implements CalculatorStrategy {
    public double calculate(double op1, double op2) {
        return op1 * op2;
    }
 
}
