package Template.BubbleSort;

public class ArrayBubbleSort extends BubbleSort{
    private int[] array;
    public ArrayBubbleSort(int[] array){
        this.array = array;
        this.setLength(array.length);
    
    }
    //子类给出抽象方法less的具体实现
    public boolean less(int i, int j){
        return array[i] < array[j];
    }
    //子类给出抽象方法swap的具体实现
    public void swap(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public void printArray(){
        System.out.println("数组的冒泡排序：");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
}
