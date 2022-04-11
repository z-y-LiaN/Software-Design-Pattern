package State.Button;

public class OffState extends State {
    Switch s;
    public OffState(Switch s) {
        this.s = s;
    }

    @Override
    // 在关闭的状态下打开开关：切换到打开状态
    public void turnOn() {
        System.out.println("操作成功：开关打开！");
        s.setState(Switch.onState);

    }
    
    @Override
    // 在关闭的状态下关闭开关，属于无效操作，无需状态转换
    public void turnOff() {
        System.out.println("别按啦！开关本来就已经是关闭的");
    }
    
}
