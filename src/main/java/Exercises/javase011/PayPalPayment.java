package Exercises.javase011;

import java.time.LocalDate;

public class PayPalPayment extends Payment{
    private String email;
    private boolean error;
    public PayPalPayment(double amount, String email){
        super(amount);
        setEmail(email);

    }

    public void setEmail(String email) {
        if(email.contains("@") && email.contains(".")){
            this.email = email;
        }else{
            System.out.println("Invalid email");
            error=true;
        }
        
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void getPaymentDetails(){
        if(email!=null && !email.isEmpty()){
        System.out.println("Payment details accepted");
        }else{
            System.out.println("Payment Detail declined");
        }
    }
    @Override
    public void processPayment() {
        if(!error){
            System.out.println("Paypal Payment processed");
        }else{
            System.out.println("Payment could not be processed");
        }
        
    }

}
