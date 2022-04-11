package State.Button;

public class OnState extends State{
    Switch s;
    public OnState(Switch s) {
        this.s = s;
    }

    @Override
    // 在打开的状态下打开开关，属于无效操作，无需状态转换
    public void turnOn() {
        System.out.println("别按啦！开关本来就已经是打开的");
    
    }

    @Override
    // 在打开的状态下关闭开关：切换到关闭状态
    public void turnOff() {
        System.out.println("操作成功！开关关闭");
        s.setState(Switch.offState);
    }
    
}
