package Composite;

public class Waitress {
    // 只需要有顶层的菜单组件:拥有所有的菜单和菜单项
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
