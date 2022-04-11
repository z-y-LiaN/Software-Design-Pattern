package Iterator.AddCafe;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        //添加的新菜单
        this.cafeMenu = cafeMenu;
    }
    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        //新菜单的迭代器
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        System.out.println("\nCAFE");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem =(MenuItem)iterator.next();
            System.out.println(menuItem.getName()+" ");
            System.out.println(menuItem.getPrice()+"--");
            System.out.println(menuItem.getDescription());
        }
    }
}
