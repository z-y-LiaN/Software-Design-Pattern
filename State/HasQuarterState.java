package State;
/**
 * 总结:
 * 针对每个状态类:
 * 1.持有糖果机的实例变量
 * 2.实现State接口的每个方法(根据当前这个状态类)
 *   每个方法实质上 是糖果机的行为
 */

import java.util.Random;

public class HasQuarterState implements State{
    // 增加一个随机数实例变量，产生10%的机会赢
    Random randomWinner = new Random(System.currentTimeMillis());
    
    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }

    public void insertQuarter(){
        System.out.println("You can't insert another quarter");
    }
    public void ejectQuarter(){
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    public void turnCrank(){
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
    public void dispense(){
        System.out.println("No gumball dispensed");
    }
    
}
