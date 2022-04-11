package State.Bank;

public class NormalState extends AccountState{

    public NormalState(Account acc) {
        this.acc=acc;
    }

    @Override
    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);

        System.out.println("成功存款￥ " + amount + ", 存后余额为 " + acc.getBalance());

        stateCheck();
    
    }

    @Override
    public void withdraw(double amount) {
        if(acc.getBalance()-amount<-2000){
            System.out.println("取款失败，最多能取￥" +(amount+acc.getBalance()));
        }else{
            acc.setBalance(acc.getBalance() - amount);
            System.out.println("成功取款￥" + amount + ", 取后余额￥ " + acc.getBalance());
            stateCheck();
        }

    }

    @Override
    public void computeInterest() {
        System.out.println("正常状态,无需支付利息");
    }

    @Override
    public void stateCheck() {
        if(acc.getBalance()<0&&acc.getBalance()>-2000){
            acc.setState(new OverdraftState(acc));
        }else if(acc.getBalance()<-2000){
            acc.setState(new RestrictedState(acc));
        }
    }
}
