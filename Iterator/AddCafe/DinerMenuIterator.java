package Iterator.AddCafe;

import java.util.Iterator;

//一个具体的迭代器,为餐厅菜单服务
public class DinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position = 0;

    //餐厅的迭代器需要一个数组
    public DinerMenuIterator(MenuItem[] items) {
        this.list = items;
    }

    //返回数组下一项,递增指针
    public Object next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (list[position - 1] != null) {
            for (int i = position - 1; i < (list.length - 1); i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }
    }
}
    
