package Composite;

//抽象的 菜单组件，为菜单项和菜单提供一个共同的接口
//有些方法只对菜单项有意义，有些方法只对菜单有意义

public abstract class MenuComponent {

    //组合方法：新增、删除、获取菜单组件
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    //操作方法，能被菜单项使用，某些也能被菜单使用
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    //能同时被菜单和菜单项使用
    public void print() {
        throw new UnsupportedOperationException();
    }
}
