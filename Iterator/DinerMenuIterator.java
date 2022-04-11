package Iterator;

//一个具体的迭代器,为餐厅菜单服务
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    //餐厅的迭代器需要一个数组
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    //返回数组下一项,递增指针
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
    
