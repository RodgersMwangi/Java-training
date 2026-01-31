package io.github.Inheritance;

public class SavingsAccount extends BankAccount{
    private final double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance){
        super(accountNumber, accountHolder, balance);
        this.interestRate=0.05;
    }

    @Override
    public void withdraw(double amount){
        if(amount>0 && amount<=(balance-100)){
            balance-=amount;
        }
        else if(amount<=0){
            System.out.println("You cannot withdraw amount equaling zero or less");
        }
        else{
            System.out.println("Insufficient funds");
            error=true;
        }
    }

    public void applyInterest(){
        double interest=interestRate*balance;
        balance+=interest;
    }

}
