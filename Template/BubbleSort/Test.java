package Template.BubbleSort;

import java.util.ArrayList;
/**
 * @author zyl
 * @StudentID 919106840212
 * @name BubbleSort
 * @description 冒泡排序：用模板方法模式实现冒泡算法，具体算法类包括数组和ArrayList类型两种.
 * @date 2022年4月11日
 */

public class Test {
    public static void main(String[]args){
        //初始化数组
        int[] array={9,1,9,1,0,6,8,4,0,2,1,2};
        ArrayList<Integer> list=new ArrayList<Integer>();
        //初始化ArrayList
        for(int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        //数组的冒泡排序：
        BubbleSort bubbleSort=new ArrayBubbleSort(array);
        bubbleSort.sort();
        bubbleSort.printArray();

        //ArrayList的冒泡排序：
        BubbleSort bubbleSort2=new ArrayListBubbleSort(list);
        bubbleSort2.sort();
        bubbleSort2.printArray();

    }
    
}
