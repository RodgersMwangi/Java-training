package io.github.Lambdas;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("jane", "peter", "tom", "janet");
        list.forEach(name->System.out.println(name));

        System.out.println("====Sorting by length====");
        list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        list.forEach(System.out::println);

        System.out.println("====multiple statements====");
        list.forEach(name-> {
            String processed= name.toUpperCase();
            int length=name.length();
            System.out.println(processed + " has a length of "+length);
        });

        List <Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List <Integer> squares = new ArrayList<>();
        numbers.forEach( number-> {
            int squared = number*number;
            squares.add(squared);
        });
        squares.forEach(System.out::println);

        
    }

}
