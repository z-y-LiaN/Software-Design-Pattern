package Template.DuckSort;
/**
 * Array中的sort方法是一个静态方法
 * 它接受一个参数，这个参数是一个数组
 * 任何数组都可以被sort方法排序
 * 前提是数组中的元素都实现了Comparable接口，否则无法排序
 * 要实现这个接口，需要在数组中的元素中实现compareTo方法
 */
public class Duck implements Comparable{
    String name;
    int weight;
    public Duck(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public String toString(){
        return this.name + " weighs " + this.weight;
    }
    public int compareTo(Object object){
        Duck otherDuck = (Duck)object;
        if(this.weight < otherDuck.weight){
            return -1;
        }else if(this.weight > otherDuck.weight){
            return 1;
        }else{
            return 0;
        }
    }
}
