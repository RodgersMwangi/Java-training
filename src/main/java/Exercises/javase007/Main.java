package Exercises.javase007;

public class Main {
    public static void main(String[] args){
        BankAccount bankAccount=new BankAccount("44444", "Rowl Jazz", 10000);
        bankAccount.deposit(1000);
        bankAccount.withdraw(3000);
        bankAccount.displayBalance();
    }

}
