package Template.BubbleSort;

public abstract class BubbleSort {
    private int length;
    //具体方法
    public final void setLength(int length){
        this.length = length;
    }
    //模板方法sort()，抽象方法less方法和swap方法交给子类实现
    public void sort(){
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length - i - 1; j++){
                if(less(j + 1, j)){
                    swap(j, j + 1);
                }
            }
        }
    }
    //抽象方法
    public abstract boolean less(int i, int j);
    public abstract void swap(int i, int j);

    //钩子方法
    public  void printArray(){};
}
