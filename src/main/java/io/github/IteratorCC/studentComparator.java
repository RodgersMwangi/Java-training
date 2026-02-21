package io.github.IteratorCC;

import java.util.*;

public class studentComparator {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Alice", 24, 4.2));
        students.add(new Student("James", 28, 3.9));
        students.add(new Student("Bob", 23, 3.3));
        students.add(new Student("Bob", 21, 3.3));

        System.out.println("Before Sorting");
        students.forEach(System.out::println);

        //sort using natural ordering (by name)
        System.out.println("After sorting");
        Collections.sort(students);
        students.forEach(System.out::println);

        //Arrays also work with comparable
        Student[] studentArray = students.toArray(new Student[0]);
        Arrays.sort(studentArray);
        System.out.println("Arrays sorted by name");
        Arrays.stream(studentArray).forEach(System.out::println);
    }

}
