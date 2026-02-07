package io.github.CollectionFrameworks;
import java.util.*;

public class ListUtilities {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        //sorting
        Collections.sort(fruits);
        System.out.println("Sorted: "+fruits);

        //searching, list must be sorted
        int index=Collections.binarySearch(fruits, "Orange");
        System.out.println(index);

        //reversing
        Collections.reverse(fruits);
        System.out.println("Reversed: "+fruits);

        //shuffling
        Collections.shuffle(fruits);
        System.out.println("Shuffled: "+fruits);

        //frequency
        fruits.add("Apple");
        int frequency=Collections.frequency(fruits, "Apple");
        System.out.println("Apple appears "+frequency);

        //Sublist
        List<String> subList=fruits.subList(1, 3);
        System.out.println(subList);
    }

}
