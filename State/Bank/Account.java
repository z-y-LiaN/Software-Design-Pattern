package State.Bank;
//在状态模式中，Account属于Context
public class Account {
    // 账户属性
    private AccountState state;
    private String owner;
    private double balance;

    // 账户状态
    // AccountState normalState;;
    // AccountState overdraftState;
    // AccountState restrictedState;

    // 初始化账户
    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        state = new NormalState(this);
        System.out.println("初始化账户 " + owner + " 的余额为￥ " + balance);
        System.out.println("----------------------------------------------------------------");
    }
    // 账户的行为，委托给状态对象执行
    public void setState(AccountState state) {
        this.state = state;
    }
    public void deposit(double amount) {
        state.deposit(amount);
    }
    public void withdraw(double amount) {
        state.withdraw(amount);
    }
    public void computeInterest() {
        state.computeInterest();
    }

    // 一堆set get方法
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
