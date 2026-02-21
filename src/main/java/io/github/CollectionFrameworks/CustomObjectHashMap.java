package io.github.CollectionFrameworks;
import java.util.*;

public class CustomObjectHashMap {
    public static void main(String[] args) {
        Map<Student, Integer> studentGrades=new HashMap<>();

        Student alice=new Student("S001", "Alice");
        Student bob = new Student("S002", "Bob");

        studentGrades.put(bob, 85);
        studentGrades.put(alice, 90);

        //This works because we overrode equals and hashCode
        Student aliceCopy = new Student("S001", "Alice");
        System.out.println("Alice's grade is "+studentGrades.get(aliceCopy));
        System.out.println("All students: "+studentGrades);
    }

}
