package Strategy.Calculator;
/**
 * 用策略模式设计一个简单计算器，能实现两个操作数的加减乘除四种运算。
 */
public class Test {
    public static void main(String[] args) {
        double op1 = 10;
        double op2 = 5;
        CalculateContext context = new CalculateContext();
        context.setOp1(op1);
        context.setOp2(op2);

        context.setCalculateStrategy(new AddStrategy());
        System.out.println("Add: " + context.calculate());

        context.setCalculateStrategy(new SubStrategy());
        System.out.println("Sub: " + context.calculate());

        context.setCalculateStrategy(new MulStrategy());
        System.out.println("Mul: " + context.calculate());

        
    }
}
