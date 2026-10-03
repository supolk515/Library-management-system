package InheriticeExercise2;

public class CreditCardAccount extends BankAccount{
    public CreditCardAccount(int accountId, double initial, int limit) {
        super(accountId, initial);
        this.limit = limit;
    }

    private int limit;
    private double creditBalance = 0;//方法中的值调用时可以变，main中不行

    public boolean pay(int amount){
        if (amount - creditBalance > limit || amount - creditBalance - balance > limit){
            System.out.println("surpass limit!");
            return false;
        }
        creditBalance -= amount;//creditBalance永久改变
        System.out.print("payment succeed!\tCreditBalance:\t" + creditBalance + "\t");
        OverdraftInterest();
        return true;
    }

    public void compensate(){
        balance += creditBalance;
        creditBalance = 0;
        System.out.print("Compensated!\t");
        OverdraftInterest();
    }

    public void OverdraftInterest(){
        if (balance < 0){
            balance += balance * 0.05;
        }
        System.out.println("Account balance: " + balance);
    }
}
