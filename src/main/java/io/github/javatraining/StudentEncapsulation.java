package io.github.javatraining;

public class StudentEncapsulation {
    private String studentId;
    private String name;
    private int age;
    private double gpa;

    public StudentEncapsulation(String studentId, String name, int age, double gpa){
        setStudentId(studentId);
        setName(name);
        setAge(age);
        setGpa(gpa);

    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        if(studentId.length()!=6){
            System.out.println("Student Id must have 6 characters.");
            return;
        }
        if(studentId.matches("[A-Za-z0-9]+")){
            this.studentId = studentId;
        }else{
            System.out.println("Student Id must only have alphanumeric characters");
        }

        
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        if(name==null || name.isEmpty()){
            System.out.println("Name cannot be empty");
            return;
        }
        if(name.length()<2){
            System.out.println("Name must be atleast 2 characters");
            return;
        }
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age<16 || age>100){
            System.out.println("Age must be between 16 and 100");
            return;
        }
        this.age=age;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        if(gpa<0.0 || gpa>4.0){
            System.out.println("GPA must be between 0.0 and 4.0");
            return;
        }
        this.gpa=gpa;
    }
    public void displayInfo(){
        System.out.println("=======================================");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("GPA: "+ gpa);
        System.out.println("=======================================");
    }


}
