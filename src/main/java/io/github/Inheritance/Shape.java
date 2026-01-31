package io.github.Inheritance;

public class Shape {
    private String color;
    protected boolean filled;

    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
    public String toString(){
        return null;

    }

}
