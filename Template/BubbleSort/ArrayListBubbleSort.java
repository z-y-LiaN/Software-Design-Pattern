package Template.BubbleSort;

import java.util.ArrayList;

public class ArrayListBubbleSort extends BubbleSort{
    private ArrayList<Integer> list;
    public ArrayListBubbleSort(ArrayList<Integer> list){
        this.list = list;
        this.setLength(list.size());
    }
    //子类给出抽象方法less的具体实现
    public boolean less(int i, int j){
        return list.get(i) < list.get(j);
    }
    //子类给出抽象方法swap的具体实现
    public void swap(int i, int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    public void printArray(){
        System.out.println("ArrayList的冒泡排序:");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
