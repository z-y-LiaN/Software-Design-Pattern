package State.Bank;
/**
 * 
 */
public class Test {
    public static void main(String[] args) {
        Account acc = new Account("zyl", 999);
        acc.deposit(200);
        acc.computeInterest();
        acc.withdraw(1200);
        acc.computeInterest();
        acc.withdraw(10000);
        acc.computeInterest();
    }
    
}
