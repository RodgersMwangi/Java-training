package io.github.IteratorCC;

import java.util.ArrayList;
import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Alice", 24, 4.2));
        students.add(new Student("James", 28, 3.9));
        students.add(new Student("Bob", 23, 3.3));
        students.add(new Student("Bob", 21, 3.3));

        System.out.println("Original order");
        students.forEach(System.out::println);

        //sort by age
        System.out.println("\n sort by age");
        Collections.sort(students, new AgeComparator());
        students.forEach(System.out::println);

        //sort by gpa
        System.out.println("\n sort by gpa");
        Collections.sort(students, new GpaComparator());

        //Anonymous comparator class for sorting by name length
        Comparator<Student> nameLengthComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2){
                return Integer.compare(s1.getName().length(), s2.getName().length());
            }
        };
        System.out.println("sort by name length");
        Collections.sort(students, nameLengthComparator);
        students.forEach(System.out::println);

        //Another anonymous comparator for reverse natural order
        Comparator<Student> reverseOrder=new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                return s2.getName().compareTo(s1.getName());
            }
        };

        System.out.println("Comparing reverse order");
        Collections.sort(students, reverseOrder);
        students.forEach(System.out::println);
    }

}
