package State.StateChange.ChangeInContext;

public class Screen {
    private State state;
    private OriginalState originalState;
    private LargerState largerState;
    private LargestState largestState;

    public Screen() {
        this.originalState = new OriginalState();
        this.largerState = new LargerState();
        this.largestState = new LargestState();
        this.state = originalState;
        this.state.display();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void onClicked() {
        if(this.state.equals(originalState)){
            this.setState(largerState);
        }else if(this.state.equals(largerState)){
            this.setState(largestState);
        }else if(this.state.equals(largestState)){
            this.setState(originalState);
        }
        this.state.display();
    }
}
