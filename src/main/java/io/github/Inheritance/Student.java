package io.github.Inheritance;

public class Student extends Person{
    private String studentId;  //car inherits vehicles properties and adds its own methods. 
    private double gpa;

    public Student(String name, int age, String studentId, double gpa){
        super(name,age); //Call parent constructor
        this.studentId=studentId;
        this.gpa=gpa;

    }

    @Override
    public void displayInformation(){
        System.out.println("Name: "+getName()+"Age: "+getAge() + "StudentId: "+ studentId + "GPA: "+gpa);
    }

}
