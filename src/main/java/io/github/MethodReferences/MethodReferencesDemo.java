package io.github.MethodReferences;

import java.util.*;

public class MethodReferencesDemo {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Alice", "Bob", "Charlie");

        //1. Static method references - Class::staticMethod
        names.forEach(System.out::println);

        //2. Instance method reference - instance::method
        String prefix="hello";
        names.forEach(prefix::concat);  //equivalent to s ->prefix.concat(s)

        //3. Instance method of arbitrary type - Class::instanceMethod
        names.forEach(String::toUpperCase);

        //4.Constructor reference  -Class::new
        List<String> upperNames=names.stream()
                                    .map(String::new)
                                        .toList();


    }

}
