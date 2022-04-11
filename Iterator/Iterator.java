package Iterator;

//定义迭代器接口
public interface Iterator {
    //是否有更多元素
    boolean hasNext();
    //返回下一个元素
    Object next();
}
