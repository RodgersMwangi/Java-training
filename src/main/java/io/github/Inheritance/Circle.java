package io.github.Inheritance;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius=radius;

    }

    @Override
    public double getArea(){
        return 3.14*(radius*radius);

    }
    @Override
    public double getPerimeter(){
        return 2*3.14*radius;
    }

}
