package Template;
//这是一个模板方法 的 模板
public abstract class AbstractClass {
    //模板方法：
    final void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    //定义成抽象，由子类具体实现
    abstract void primitiveOperation1();
    abstract void primitiveOperation2();

    //具体方法声明为final，子类就无法覆盖
    final void concreteOperation(){
        //实现细节
        System.out.println("Concrete Operation");
    }

    //钩子，具体方法，什么都不做
    void hook(){}
}
