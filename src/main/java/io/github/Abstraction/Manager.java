package io.github.Abstraction;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, String id, double salary){
        super(name, id, salary);
    }
    @Override
    public double calculateBonus(){
        bonus=getSalary()*0.15;
        return bonus;
    }
}
