package Exercises.javase011;

import java.time.LocalDate;

public class BankTransferPayment extends Payment{
    private String accountNumber;
    private String bankName;
    private boolean error;

    public BankTransferPayment(double amount, String accountNumber, String bankName){
        super(amount);
        this.accountNumber=accountNumber;
        this.bankName=bankName;
    }

    public void setAccountNumber(String accountNumber) {
        if(accountNumber.length()>16){
            this.accountNumber = accountNumber;
        }else{
            System.out.println("Invalid account number");
            error=true;
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getBankName() {
        return bankName;
    }

    @Override
    public void getPaymentDetails(){
        if(accountNumber!=null && !accountNumber.isEmpty()){
            System.out.println("Payment details accepted");
        }else{
            System.out.println("Payment details declined");
            error=true;
        }
    }
    @Override
    public void processPayment(){
        if(!error){
        System.out.println("Bank Payment processed");
    }else{
        System.out.println("Payment could not be processed");
    }
    }

}
