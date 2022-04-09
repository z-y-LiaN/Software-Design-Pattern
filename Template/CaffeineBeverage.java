package Template;

import javafx.scene.layout.BorderWidths;

public abstract class CaffeineBeverage{
    //prepareRecipe()就是一个模板方法
    //
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling Water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }

}