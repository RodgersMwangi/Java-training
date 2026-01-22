package Exercises.javase008;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Temperature temperature=new Temperature(66.85);
        //temperature.converter();

        Book book=new Book("1234567890123", "Now or Never", "Jane Doe", true, LocalDate.of(2026,5,23));
        Book book2=new Book("1234567854423", "New World", "John Doe", true, LocalDate.of(2026,3,23));
        book2.displayInfo();
        book2.borrowBook();
        book2.displayInfo();
        book2.borrowBook();
        book2.returnBook();
        book2.displayInfo();

    }

}
