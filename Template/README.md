复习：先看AbstracrClass.java了解模板的大致框架，然后再看实现的具体代码

1、模板方法模式：
- 模板方法模式（Template Method Pattern）是一种结构型设计模式。
- 它定义了一个操作中的算法的骨架，而将一些步骤延迟到子类中。
- 模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
- 模板方法模式是一种对象行为型模式。

2、无钩子：
- Coffee.java、Tea.java、CaffeineBeverage.java
- 实现了模板方法中的抽象方法，但是没有钩子方法，所以没有自己的功能

3、有钩子：
- TeaWithHook.java、CoffeeWithHook.java、CaffeineBeverageWithHook.java
- 实现了模板方法中的抽象方法，并且实现了钩子方法，所以有自己的功能

4、BeverageTestDrive.java
- 测试模板方法模式