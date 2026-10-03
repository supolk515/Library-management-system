package InheriticeExercise2;

public class AccountOperation {
    public static void main(String[] args){
        CreditCardAccount CreditCard1 = new CreditCardAccount(114514,10000,50000);
        CreditCard1.pay(20000);
        CreditCard1.pay(50000);
        CreditCard1.compensate();
        CreditCard1.pay(30000);
    }
}
