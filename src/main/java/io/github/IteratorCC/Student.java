package io.github.IteratorCC;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }

    //natural ordering by name
    @Override
    public int compareTo(Student other){
        int nameCompare= this.name.compareTo(other.name);
        if(nameCompare!=0){
            return nameCompare;
        }
        //if names are equal, compare age
        return Integer.compare(this.age, other.age);
    }
    @Override
    public String toString(){
        return "Student{name="+name+" age="+age+" gpa="+gpa;
    }
    public int getAge() {
        return age;
    }
    public double getGpa() {
        return gpa;
    }
    public String getName() {
        return name;
    }


}
