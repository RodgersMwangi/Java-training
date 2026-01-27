package Exercises.javase011;

import java.time.LocalDate;

public abstract class Payment {
    private double amount;
    private LocalDate paymentDate;

    //constructor
    public Payment(double amount){
        this.amount=amount;
        this.paymentDate=LocalDate.now();
    }
        
    public LocalDate getPaymentDate(){
        return paymentDate;
    }
    public abstract void processPayment();
    public abstract void getPaymentDetails();
    public void validateAmount(){
        if(amount>0){
            
            System.out.println("Valid amount");
        }else{
            System.out.println("Amount must be more than zero");
        }
    }
    

}
