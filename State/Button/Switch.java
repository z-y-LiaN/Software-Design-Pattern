package State.Button;

public class Switch {
    // 多个switch对象 共享(public) 同一个state对象，声明为static
    public static State state;
    public static OnState onState;
    public static OffState offState;
    
    private String name;

    public Switch(String name) {
        this.name = name;
        onState = new OnState(this);
        offState = new OffState(this);
        state = offState; //初始默认为关闭状态
    }
    
    // 将动作委托给状态类
    public void turnOn(){
        System.out.println("当前操作：打开开关 "+name);
        Switch.state.turnOn();
    }
    public void turnOff(){
        System.out.println("当前操作：关闭开关 "+name);
        Switch.state.turnOff();
    }

    public  void setState(State state) {
        Switch.state = state;
    }
    public void getState(){
        System.out.println("当前开关"+name+"状态："+state.getClass().getSimpleName());
    }
    
}
