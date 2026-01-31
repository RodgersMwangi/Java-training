package Assignment.javase014.Problem2;

public class InvalidTransactionException extends RuntimeException{
    
    public InvalidTransactionException(double amount){
        super("You cannot deposit KSH "+amount+ ". Amounts totalling to zero or less cannot be accepted");
        
    }
    public InvalidTransactionException(double amount, boolean withdraw){
        super("You cannot withdraw KSH "+amount+ ". Amounts totalling to zero or less cannot be accepted");
        
    }
    public InvalidTransactionException(double amount, String transfer){
        super("You cannot send KSH "+amount+ ". Amounts totalling to zero or less cannot be accepted");
        
    }
    public InvalidTransactionException(){
        super("Invalid Details Entered!");
    }
    
    

}
