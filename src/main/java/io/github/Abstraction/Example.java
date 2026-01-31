package io.github.Abstraction;

public class Example {
    private String instanceVariable="instance data";
    private static String staticVariable="static data";

    public void instanceMethod(){
        System.out.println("Instance method");
    }

    public static void staticMethod(){
        
        System.out.println(staticVariable);
        
    }
    public static void anotherStaticMethod(){
        System.out.println("Another static variable");
    }

}
