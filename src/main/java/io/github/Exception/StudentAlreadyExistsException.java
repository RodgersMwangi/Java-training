package io.github.Exception;

public class StudentAlreadyExistsException extends Exception{  //checked exception
    public StudentAlreadyExistsException(String message){
        super(message);
    }

}
