package io.github.IteratorCC;

import java.util.ArrayList;
import java.util.*;

public class ModernComparator {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Alice", 24, 4.2));
        students.add(new Student("James", 28, 3.9));
        students.add(new Student("Bob", 23, 3.3));
        students.add(new Student("Bob", 21, 3.3));

        //Using Comparator.comparing() - method reference
        Comparator <Student> byName=Comparator.comparing(Student::getName);
        Collections.sort(students, byName);
        System.out.println("Sorted by name");
        students.forEach(System.out::println);
        
        //Using Comparator.comparing() with lambda
        Comparator<Student> byAge=Comparator.comparing(s -> s.getAge());
        Collections.sort(students, byAge);
        System.out.println("Sorted by Age");
        students.forEach(System.out::println);

        //Reverse order
        Comparator<Student> byNameReverse=Comparator.comparing(Student::getName).reversed();
        Collections.sort(students, byNameReverse);
        System.out.println("By name reversed");
        students.forEach(System.out::println);

    }

}
