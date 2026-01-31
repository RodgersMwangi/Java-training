package io.github.Exception;

public class StudentNotFoundException extends RuntimeException{ //unchecked exception
    public StudentNotFoundException(String message){
        super(message);
    }
}
