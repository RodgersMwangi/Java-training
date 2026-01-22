package Exercises.javase007;


public class BankAccount {
    public String accountNumber;
    public String accountHolder;
    public double balance;

    //Default Constructor
    public BankAccount(){
        accountHolder="Null";
        accountNumber="Null";
        balance=0.0;

    }

    //Constructor with account no. and holder info
    public BankAccount(String accountNumberParameter, String accountHolderParameter){
        accountNumber=accountNumberParameter;
        accountHolder=accountHolderParameter;

    }

    //constructor with all account and balance info
    public BankAccount(String accountNumberParameter, String accountHolderParameter, double balanceParameter){
        accountNumber=accountNumberParameter;
        accountHolder=accountHolderParameter;
        balance=balanceParameter;
        System.out.println("Welcome "+ accountHolder + ". Your Current Balance is " + balance);
        System.out.println();
    }

    //method to deposit
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Deposited: "+ amount);
            System.out.println();
        }else{
            System.out.println("The transaction could not be completed");
        }
        

    }

    //method to withdraw
    public void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("KSH "+ amount + " withdrawn");
            System.out.println();
            
        }else{
            System.out.println("The transaction could not be completed");
        }
        
    }

    //method to show the details
    public void displayBalance(){
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Account Holder: "+ accountHolder);
        System.out.print("Your balance is: "+ balance);
      
    }

}
