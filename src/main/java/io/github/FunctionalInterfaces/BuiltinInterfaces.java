package io.github.FunctionalInterfaces;

import java.util.function.*;

public class BuiltinInterfaces {
    public static void main(String[] args) {
        //1. Predicate<T> - takes T, returns boolean
        Predicate<String> isLong=s->s.length()>5;
        System.out.println("Is hello long? "+isLong.test("hello"));

        //2. Function<T,R> - Takes T, returns R
        Function<String, Integer> stringLength=s->s.length();
        System.out.println("Length of Hello, "+stringLength.apply("Hello"));

        //3 Consumer<T> takes T, returns void
        Consumer<String> printing=s->System.out.println("Value: "+s);
        printing.accept("Hello world");

        //4. Supplier<T> - takes nothing, returns T
        Supplier<Double> randos=() -> Math.random();
        System.out.println("Today's random number is "+randos.get());

        //5. UnaryOperator<T> takes T returns T (special case of function)
        UnaryOperator<String> toUpper= s->s.toUpperCase();
        System.out.println("hello to "+toUpper.apply("hello"));

        //6. Binary Operator - takes two T and returns one T
        BinaryOperator<Integer> adder = (a,b)-> a+b;
        System.out.println("4+5="+adder.apply(4, 5)); 
    }

}
