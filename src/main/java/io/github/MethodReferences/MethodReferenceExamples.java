package io.github.MethodReferences;

import java.util.*;
import java.util.function.Function;

public class MethodReferenceExamples {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("alice", "bob", "charlie",null, "diana"));

        //static method references
        Function<String, Integer> parser=Integer::parseInt;
        System.out.println("Parsed "+parser.apply("123"));

        //remove nulls using static method references
        names.removeIf(Objects::isNull);
        System.out.println(names);

        //Instance method reference on specific object
        String prefix="Name: ";
        names.forEach(prefix::concat);

        //instance method of arbitrary type - Class:instanceMethod
        names.forEach(String::toUpperCase);
        
        //Constructor reference
        List<String> upperNames=names.stream()
                                        .map(String::new) //s->new String(s)
                                        .toList();
        
        
        
        

        
    }

}
