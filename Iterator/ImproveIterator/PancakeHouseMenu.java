package Iterator.ImproveIterator;

import java.util.ArrayList;
import java.util.Iterator;
//原煎饼屋菜单的实现
public class PancakeHouseMenu implements Menu{
    //使用ArrayList来存储所有的菜单项
    ArrayList menuItems;
    //每个菜单项都存储在ArrayList中
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    //添加菜单项,创建每一个菜单,把它加入到ArrayList中
    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    
    //返回菜单项列表
    // public ArrayList getMenuItems() {
    //     return menuItems;
    // }
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
