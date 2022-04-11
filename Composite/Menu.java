package Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    // 菜单可以有任意数目的孩子,且也属于MenuComponent类型
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    // 给每个菜单一个名字和描述
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // 将菜单项和其他菜单加入到菜单中
    // 都是MenuComponent,所以一个方法可以兼顾两种类型
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    // 未覆盖getPrice()和isVegetarian()方法，因为这两个方法只对菜单项有意义
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        // 一个递归的遍历
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

}
