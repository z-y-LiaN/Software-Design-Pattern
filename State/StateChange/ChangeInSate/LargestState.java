package State.StateChange.ChangeInSate;

public class LargestState extends State{
    public LargestState(Screen screen) {
        super(screen);
    }

    @Override
    public void display() {
        System.out.println("屏幕被放大了两倍");
    }

    @Override
    public void stateCheck() {
        screen.setState(new OriginalState(screen));
    }
    
}
