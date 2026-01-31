package Assignment.javase014.Problem2;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(String accountNumber){
        super("Account with account Number "+accountNumber+" not found");
    }

}
