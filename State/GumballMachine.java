package State;

public class GumballMachine {

    // 糖果机的所有状态
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    //新增一个状态
    State winnerState;

    // 糖果机的当前状态，默认为soldOutState
    State state = soldOutState;

    // 糖果机的糖果数量
    int count = 0;

    // 构造器，初始化糖果机的糖果数量
    public GumballMachine(int numberGumballs) {
        // 每个状态都有一个糖果机的状态实例
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        
        //初始化新增的一个状态
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        // 如果有糖果，则改变糖果机的状态为noQuarterState
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }
    
    // 下面就是用户对糖果机的操作：投币、退币、转动曲柄
    // 这些操作的实现全部委托给了当前的state
    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
        //不需要在糖果机类中写dispense():因为用户不可以直接要求机器发糖果
        //发糖果在转动曲柄后，由state.dispense()来完成
    }
    public void setState(State state) {
        this.state = state;
    }

    //辅助方法 释放糖果
    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
    //获取每种状态
    public State getSoldOutState(){
        return soldOutState;
    }
    public State getNoQuarterState(){
        return noQuarterState;
    }
    public State getHasQuarterState(){
        return hasQuarterState;
    }
    public State getSoldState(){
        return soldState;
    }
    public State getWinnerState(){
        return winnerState;
    }
    public int getCount(){
        return count;
    }
}
