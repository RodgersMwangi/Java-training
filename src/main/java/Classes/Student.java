package Classes;

public class Student {
    public String name;
    public int age;
    public double gpa;

    public Student(String studentName, int studentAge, double studentGPA){
        name=studentName;
        age=studentAge;
        gpa=studentGPA;
        System.out.println("Student object created: "+ studentName);
    }

    public Student(String studentName, int studentGPA){
        name=studentName;
        gpa=studentGPA;
    }

    public Student(){

    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
    @Override
    public String toString(){
        return "Names: "+name+" GPA: "+gpa;
    }

}
