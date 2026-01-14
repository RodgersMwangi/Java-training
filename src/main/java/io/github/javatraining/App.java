package io.github.javatraining;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int balance=8000;
        //withdraw 5400
        balance-=5400;
        double newvalue=(double)balance/3;
        System.out.println(newvalue);
        System.out.println( "Your balance is " + balance );
    }
}
