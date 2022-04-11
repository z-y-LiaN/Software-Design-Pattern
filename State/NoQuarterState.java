package State;

// 没有硬币的状态，实现了State接口
// 这个状态类 实现适合这个该状态的所有行为
// 这些行为会让糖果机的状态发生改变
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    // 得到糖果机的引用，记录在实例变量中
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    // 在没有硬币的状态下，投币
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        // 更改糖果机状态为有硬币的状态
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    // 剩下的其他的不合法状态
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

}
