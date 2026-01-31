package io.github.Inheritance;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void displayInformation(){
        System.out.println("Name: "+ name + "\nAge: "+ age);
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

}
