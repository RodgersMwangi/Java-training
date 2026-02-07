package io.github.CollectionFrameworks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruits: "+fruits);
        fruits.add(1, "Mango"); //adds
        System.out.println("Fruits: "+fruits);

        String fruitOne=fruits.get(0);
        fruits.set(2, "Grape"); //replaces
        System.out.println("Fruits: "+fruits);

        fruits.remove(2);
        System.out.println("Fruits: "+fruits);

        boolean hasApple=fruits.contains("Grape");
        System.out.println(hasApple);
    }
}
