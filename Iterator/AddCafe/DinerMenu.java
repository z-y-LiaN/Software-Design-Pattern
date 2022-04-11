package Iterator.AddCafe;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    public DinerMenu() {
        //menuItems存储所有的菜单项
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false,
                3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false,
                3.05);
    }
    //相比PancakeHouseMenu,这里的addItem方法增加了数组长度的判断
    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    //原始的返回菜单项数组,如果用户需要遍历菜单项的话
    //会暴露遍历的具体实现(for循环...)
    // public MenuItem[] getMenuItems() {
    //     return menuItems;
    // }
    
    //返回一个迭代器接口,这里使用了迭代器模式
    //waiterss只需要遍历菜单项,而不需要知道菜单项的细节
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
