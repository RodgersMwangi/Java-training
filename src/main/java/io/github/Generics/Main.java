package io.github.Generics;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        String first=stringList.get(0);
        
        Pair<String, String> paired=new Pair<>("animal", "cat");
        System.out.println(paired.toString());

        String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);
    }

}
