package Exercises.javase008;

import java.time.LocalDate;

public class Book {

    private final String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private LocalDate dueDate;

    boolean error;

    //constructor
    public Book(String isbn, String title, String author, boolean isAvailable, LocalDate dueDate){
        if(isbn.length()!=13){
            System.out.println("isbn must be 13 digits");
            error=true;
            
        }
        if(!isbn.matches("\\d+")){
            System.out.println("Only numeric characters allowed");
            error=true;
            
        }
        this.isbn = isbn;
        this.isAvailable=isAvailable;
        setAuthor(author);
        setTitle(title);
        this.dueDate=dueDate;

    }
    

    //setters and getters
    public String getIsbn() {
        
        return isbn;
    }
    
    public void setTitle(String title){
        if(title.isEmpty()){
            System.out.println("Title cannot be empty");
            error=true;
            return;
        }
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author) {
        if(author.isEmpty()){
            System.out.println("Author cannot be empty");
            error=true;
            return;
        }
        this.author = author;
    }
    public boolean isAvailable() {
        return isAvailable;
    }


    //methods
    public void borrowBook(){
        if(isAvailable){
            System.out.println("You have borrowed "+ title + " \nIsbn: "+isbn);
            isAvailable=false;
        }else{
            System.out.println("The book titled "+ title + " is not available");
        }
    }
    public void returnBook(){
        isAvailable=true;
        System.out.println("You have returned "+ title + " \nIsbn: "+isbn);
    }

    //check if book is overdue
    public boolean isOverDue(){
        LocalDate today=LocalDate.now();
        if(today.isAfter(dueDate)){
            return true;
        }else{
            return false;
        }
    }
    public void displayInfo(){
        if(!error){
            System.out.println();
            System.out.println("=========================================");
            System.out.println(" Title: " + title + "\n isbn: "+ isbn + "\n Author: "+ author+ "\n Availability: "+ isAvailable + "\n Due Date "+ dueDate);
            System.out.println("=========================================");
        }
        
    }


}
