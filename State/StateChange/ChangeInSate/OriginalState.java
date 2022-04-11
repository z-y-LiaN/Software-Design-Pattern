package State.StateChange.ChangeInSate;

public class OriginalState extends State{

    public OriginalState(Screen screen) {
        super(screen);
    }

    @Override
    public void display(){
        System.out.println("屏幕当前是默认大小");
    }

    @Override
    public void stateCheck(){
        screen.setState(new LargerState(screen));
    }
    
}
