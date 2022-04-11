package Iterator.AddCafe;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    //用散列表存储菜单项
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29);
    }
    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        //将菜单项添加到散列表中:名称 + 值menuItem
        menuItems.put(menuItem.getName(), menuItem);
    }

    //我们要取的是 menuItems散列表中的值的迭代器
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
