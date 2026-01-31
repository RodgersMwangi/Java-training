package io.github.Abstraction;

public class Intern extends Employee{
    private final double BONUS=500;
   

    public Intern(String name, String id, double salary){
        super(name, id, salary);
    }

    @Override
    public double calculateBonus(){
        return BONUS;
    }

    

}
