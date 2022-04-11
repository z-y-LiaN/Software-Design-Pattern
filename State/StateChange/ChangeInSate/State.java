package State.StateChange.ChangeInSate;

public abstract class State {
    //每一个状态都持有一个Screen对象,所以可以把Screen对象放在State类中
    //同时记得写构造方法
    protected Screen screen;
    public State(Screen screen){
        this.screen=screen;
    }
    
    public abstract void display();
    public abstract void stateCheck();
}
