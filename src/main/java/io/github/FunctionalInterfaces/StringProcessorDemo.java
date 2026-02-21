package io.github.FunctionalInterfaces;

public class StringProcessorDemo {
    public static void main(String[] args) {
        //lambda implementing String processor
        StringProcessor toUpper=s->s.toUpperCase();
        StringProcessor addExclamation = t -> t+"!";

        System.out.println(toUpper.process("wow"));
        System.out.println(addExclamation.process("now"));
        System.out.println(addExclamation.processTwice("how"));
    }

}
