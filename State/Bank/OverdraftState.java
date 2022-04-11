package State.Bank;

public class OverdraftState extends AccountState{
    public OverdraftState(Account acc) {
        this.acc=acc;
    }

    @Override
    public void deposit(double amount){
        acc.setBalance(acc.getBalance()+amount);
        System.out.println("成功存款￥ "+amount+", 存后余额￥ "+acc.getBalance());
        stateCheck();
    }

    @Override
    public void withdraw(double amount){
        if(acc.getBalance()-amount<-2000){
            System.out.println("取款失败，当前最多取出￥ "+(2000+acc.getBalance()));
        }else {
            acc.setBalance(acc.getBalance() - amount);
            System.out.println("成功取款￥ " + amount + ", 取后余额￥ " + acc.getBalance());
            stateCheck();
        } 
    }

    @Override
    public void computeInterest(){
        System.out.println("提醒：按天数计算利息");
    }

    @Override
    public void stateCheck(){
        if(acc.getBalance()>0){
            acc.setState(new NormalState(acc));
        }else if(acc.getBalance()==-2000){
            acc.setState(new RestrictedState(acc));
        }
    }
}
