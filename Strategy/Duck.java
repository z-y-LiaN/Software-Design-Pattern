package Strategy;

public abstract class Duck {
    // 加入两个实例变量
    // 每个鸭子对象都会动态地设置 这些变量在运行时的正确的行为类
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }
    public void swim(){
    }
    public void display(){}

    // 不用原来的fly和quack方法，而是写到这个方法里面
    // 体现出把原来的行为 委托 给了具体的行为类
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    // 动态设定行为,可以让鸭子的行为变化
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
