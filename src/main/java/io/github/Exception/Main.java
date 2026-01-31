package io.github.Exception;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static Set<String> names = new HashSet<>(Set.of("Tom", "Cat", "Dan","Wong"));
    public static void main(String[] args) {
        /* 
        try{
            createStudent("Wong", "534r4w", "IT");
        }catch(StudentAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
            */
        
        try{
            findStudentByName("Rowl");
        }catch(StudentNotFoundException e){
            System.out.println(e.getMessage());
        }
      
        System.out.println("Hello");
        
    }
    public static void createStudent(String name, String regNo, String course) throws StudentAlreadyExistsException{
        //throw an error if student exists
        //throws is used during the method declaration
        //throws informs the compiler or dev on the kind of exception a method can raise
        
        
        if(names.contains(name)){
            throw new StudentAlreadyExistsException("Student "+name+" already exists");
            //throw is used within code block
        }
        names.add(name);
    }
    public static String findStudentByName(String name){
        if(names.contains(name)){
            return name;
        }
        throw new StudentNotFoundException("Student "+name+" not found");
        //we do not need throws for unchecked exception

    }

}

