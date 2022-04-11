package State;

public interface State {
    public void insertQuarter();//投币
    public void ejectQuarter();//退币
    public void turnCrank();//转动曲柄
    
    public void dispense();//发放糖果
}
