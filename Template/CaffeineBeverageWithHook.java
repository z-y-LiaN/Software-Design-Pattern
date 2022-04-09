package Template;

public abstract class CaffeineBeverageWithHook {

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        //钩子控制了咖啡因饮料是否执行某部分算法
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    final void boilWater() {
        System.out.println("Boiling Water");
    }

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }
    //这就是一个钩子，子类可以覆盖，也可以不覆盖
    boolean customerWantsCondiments() {
        return true;
    }

}
