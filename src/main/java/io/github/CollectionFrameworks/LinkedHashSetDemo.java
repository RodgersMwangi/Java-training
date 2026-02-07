package io.github.CollectionFrameworks;

import java.util.*;


public class LinkedHashSetDemo {
    public static void main(String[] args) {
        /*
        same as hashset but maintains insertion order
        */

        Set<String> colors=new LinkedHashSet<>();
        colors.add("blue");
        colors.add("red");
        colors.add("purple");
        colors.add("green");
    }

}
