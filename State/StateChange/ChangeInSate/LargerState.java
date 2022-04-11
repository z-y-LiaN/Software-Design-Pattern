package State.StateChange.ChangeInSate;

public class LargerState extends State{
    public LargerState(Screen screen) {
        super(screen);
    }

    @Override
    public void display() {
        System.out.println("屏幕被放大了一倍");
    }

    @Override
    public void stateCheck() {
        screen.setState(new LargestState(screen));
    }

    
}
