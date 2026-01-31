package Assignment.javase014.Problem2;

public class InsufficientFundsException extends Exception{
    
    

    public InsufficientFundsException(double amount, double balance){
        super("Insufficient funds. \nWithdrawal request: "+amount+"\nBalance: "+balance);
    }
    public InsufficientFundsException(double amount, double balance, boolean transfer){
        super("Insufficient funds. \nTransfer request: "+amount+"\nBalance: "+balance);
    }
    

}
