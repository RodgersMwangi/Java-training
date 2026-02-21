package io.github.javatraining;
import java.time.LocalDate;
import java.util.Scanner;

import Exercises.javase007.BankAccount;
//import Exercises.javase008.Book;
import Exercises.javase008.Temperature;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        StudentEncapsulation student = new StudentEncapsulation("123456", "Jane Doe", 17, 3.2);
        //student.displayInfo();

        Temperature temperature=new Temperature(66.85);
        //temperature.converter();

        //Book book=new Book("1234567890123", "", "Jane Doe", true, 20.22);
        //Book book2=new Book("1234567854423", "New World", "John Doe", false, 34.22);
        //book2.borrowBook();
        //book.borrowBook();
       
        //System.out.println(book2);

        
    }

    
}
