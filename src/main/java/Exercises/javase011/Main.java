package Exercises.javase011;

public class Main {
    public static void main(String[] args){
        Payment pay1=new CreditCardPayment(1000, "4323-2332-3223-2233", 2026, 3 );
        Payment pay2 = new PayPalPayment(1000, "wowl@email.com");
        Payment pay3=new BankTransferPayment(1000, "4535343555434", "Peoples");
        pay3.getPaymentDetails();
        pay3.processPayment();
        pay3.validateAmount();
    }

}
