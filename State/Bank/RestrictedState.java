package State.Bank;

public class RestrictedState extends AccountState {
    public RestrictedState(Account acc) {
        this.acc=acc;
    }

    @Override
    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);

        System.out.println("提醒：成功存款￥ " + amount + ", 存后余额： " + acc.getBalance());

        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("提醒：账户取款受限");
    }

    @Override
    public void computeInterest() {
        System.out.println("提醒：按天数计算利息");
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance() > 0) {
            acc.setState(new NormalState(acc));
        } else if (acc.getBalance()<0&&acc.getBalance()>-2000) {
            acc.setState(new OverdraftState(acc));
        }
    }
    
}
