package Exercises.javase011;

import java.time.LocalDate;
import java.time.YearMonth;

public class CreditCardPayment extends Payment{
    private String cardNumber;
    private YearMonth expiryDate;
    private YearMonth now=YearMonth.now();
    private boolean error;

    public CreditCardPayment(double amount, String cardNumber, int year, int month){
        super(amount);
        setExpiryDate(year,month);
        setCardNumber(cardNumber);

    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public void setExpiryDate(int year, int month) {
        if(month>0 && month<=12){
            this.expiryDate = YearMonth.of(year, month);
        }else{
            System.out.println("Invalid date");
            error=true;
        }
        
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public YearMonth getExpiryDate() {
        return expiryDate;
    }


@Override
public void getPaymentDetails(){
    if(cardNumber.length()==19 && now.isBefore(expiryDate)){
        System.out.println("Payment Details accepted");
    }else{
        System.out.println("Payment details declined");
        error=true;
    }
}

@Override
public void processPayment(){
    if(!error){
        System.out.println("Credit card Payment processed");
    }else{
        System.out.println("Payment could not be processed");
    }
}
}
