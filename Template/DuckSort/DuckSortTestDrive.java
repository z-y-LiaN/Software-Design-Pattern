package Template.DuckSort;

import java.util.Arrays;
public class DuckSortTestDrive {
    public static void main(String[]args){
        Duck[] ducks ={
            new Duck("Daffy", 8),
            new Duck("Dewey", 2),
            new Duck("Howard", 7),
            new Duck("Louie", 4),
            new Duck("Donald", 1)
        };
        System.out.println("Before sorting...");
        display(ducks);
        //排序，传入的参数是一个数组，返回的是一个排好序的数组
        Arrays.sort(ducks);
        System.out.println("\nAfter sorting...");
        display(ducks);
    }
    public static void display(Duck[] ducks){
        for(Duck duck : ducks){
            System.out.println(duck);
        }
    }
}
