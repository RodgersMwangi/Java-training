package io.github.Abstraction;

public abstract class Employee {
    private String name;
    private String id;
    private double salary;
     private static String compName="Systech";

    public Employee(String name, String id, double salary){
        setName(name);
        setId(id);
        setSalary(salary);

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public abstract double calculateBonus();

    public void displayInfo(){
        System.out.println("Name: "+name+"\nid: "+id+"\nsalary: "+salary);
    }
    public static void named(){
        System.out.println(compName);
    }



}
