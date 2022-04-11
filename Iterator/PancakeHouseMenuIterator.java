package Iterator;

import java.util.ArrayList;

//一个具体的迭代器,为PancakeHouse菜单服务
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList Items;
    int position = 0;
    //PancakeHouse的迭代器需要一个ArrayList
    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.Items = menuItems;
    }

    //实现迭代器接口
    public Object next() {
        MenuItem menuItem = (MenuItem) Items.get(position);
        position = position + 1;
        return menuItem;
    }
    public boolean hasNext() {
        if (position >= Items.size() || Items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }
    
}
