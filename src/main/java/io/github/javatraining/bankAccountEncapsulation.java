package io.github.javatraining;

public class bankAccountEncapsulation {

    //private fields
    private String accountNumber;
    private String accountHolder;
    private double balance;

    //Public Constructor
    public bankAccountEncapsulation(String accountNumber, String accountHolder, double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    //Getter for accountNumber - read only
    public String getAccountNumber(){
        return accountNumber;
    }  //Getter for account Holder - read only
    public String getAccountHolder(){
        return accountHolder;
    }
    //setter for accountHolder with validation
    public void setAccountHolder(String accountHolder){
        if(accountHolder==null || accountHolder.isEmpty()){
            System.out.println("Holder cannot be empty");
            return;
        }
        if(accountHolder.length()<2){
            System.out.println("Cannot be less than 2 characters");
            return;
        }
        this.accountHolder=accountHolder;
    }
    //Getter for balance - read only
    public double getBalance(){
        return balance;
    }

}
