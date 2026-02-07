package io.github.Generics;


import Classes.Student;

public class BoxDemo {
    public static void main(String[] args) {
        //Box for String
        Box<String> stringBox=new Box<>("Hello Generics");
        System.out.println(stringBox);

        //Box for integer
        Box<Integer> intBox=new Box<>(43);
        System.out.println(intBox);

        //Box for custom objects
        Box<Student> james=new Box<>(new Student("James", 4));
        Student student=james.getContent();
        System.out.println(james);
    }

    

}
