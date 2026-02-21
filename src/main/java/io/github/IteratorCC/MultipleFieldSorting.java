package io.github.IteratorCC;

import java.util.ArrayList;
import java.util.*;

public class MultipleFieldSorting {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Alice", 24, 4.2));
        students.add(new Student("James", 28, 3.9));
        students.add(new Student("Bob", 23, 3.3));
        students.add(new Student("Bob", 21, 3.3));
        students.add(new Student("Alice", 24, 3.8));

        Comparator<Student> byNameThenAge = new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                int nameCompare=s1.getName().compareTo(s2.getName());
                if(nameCompare!=0){
                    return nameCompare;
                }
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        };
        Collections.sort(students, byNameThenAge);
        System.out.println("Sorted by name then age");
        students.forEach(System.out::println);

        //Modern way
        Comparator<Student> modernMultiField=
            Comparator.comparing(Student::getName)
            .thenComparing(Student::getAge)
            .thenComparing(Student::getGpa);

        Collections.sort(students, modernMultiField);
        System.out.println("Sorted by multi field");
        students.forEach(System.out::println);

        //Mixed ascending or descending
        Comparator<Student> mixedOrder=
            Comparator.comparing(Student::getName)
                .thenComparing(Comparator.comparing(Student::getGpa).reversed());

        Collections.sort(students, mixedOrder);
        System.out.println("Mixed Order");
        students.forEach(System.out::println);

    }

}
