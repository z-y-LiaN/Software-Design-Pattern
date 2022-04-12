package Strategy.Calculator;

public class CalculateContext {
    private CalculatorStrategy strategy;
    private double op1;
    private double op2;

    public double calculate(){
        return strategy.calculate(op1, op2);
    }

    public void setCalculateStrategy(CalculatorStrategy strategy){
        this.strategy = strategy;
    }

    public void setOp1(double op1){
        this.op1 = op1;
    }

    public void setOp2(double op2){
        this.op2 = op2;
    }

    public void getOp1(){
        System.out.println("op1: " + op1);
    }

    public void getOp2(){
        System.out.println("op2: " + op2);
    }
}
