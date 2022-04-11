package Strategy;

public class MallardDuck extends Duck{
    // 继承自Duck类，所以有这两个实例变量
    // 当MalldardDuck对象实例化时，会自动设置这两个实例变量
    public MallardDuck(){
        // 鸭子的这些行为 是组合而来，而不是继承而来
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
    
}
