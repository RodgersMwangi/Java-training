package io.github.FunctionalInterfaces;

@FunctionalInterface
interface StringProcessor {
    String process(String input);

    default String processTwice(String input){
        return process(process(input));
    }

    static String toUpperCase(String input){
        return input.toUpperCase();
    }

}
