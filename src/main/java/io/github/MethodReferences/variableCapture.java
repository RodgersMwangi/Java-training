package io.github.MethodReferences;

import java.util.function.Consumer;

/*
    Lambdas can only access final or effectively final variables
    An effectively final variable is a variable whose value is assigned only once

    int number = 10;   // not declared final
    As long as you don’t reassign number, it is effectively final.

    Only local variables (including method parameters) must be final or effectively final when used inside lambdas or anonymous classes.

    Instance variables and static variables do NOT have this restriction.
*/

public class variableCapture {

    public static void main(String[] args) {
        final String fixedPrefix="Mr";
        String dynamicPrefix="Hi";
        String testPrefix="Wow";
        testPrefix="Now";

        Consumer<String> fixer=name->System.out.println(dynamicPrefix+name);
        fixer.accept("Rowl");
    }


}
