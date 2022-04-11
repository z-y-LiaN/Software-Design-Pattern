package State.StateChange.ChangeInSate;


public class Screen {
    private State state;
    
    public Screen(){
        this.state=new OriginalState(this);
        this.state.display();
    }

    public void setState(State state) {
        this.state = state;
    }

    // 一旦点击，将点击的行为委托给状态类执行
    public void onClicked(){
        this.state.stateCheck();
        this.state.display();
    }
    
}
