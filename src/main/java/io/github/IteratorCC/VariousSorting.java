package io.github.IteratorCC;
import java.util.*;

public class VariousSorting {
    public static void main(String[] args) {
        //array sorting
        String[] names = {"Charlie", "Alice", "Bob"};
        System.out.println("Original Array: "+Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("Sorted array: "+Arrays.toString(names));

        //Array sorting with comparator
        Arrays.sort(names, Comparator.reverseOrder());
        System.out.println("Reverse sorted array: "+ Arrays.toString(names));

        //Set sorting: Convert to arrayList first
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(15);
        numbers.add(1);

        System.out.println("Original set: "+numbers);
        List<Integer> listNumbers=new ArrayList<>(numbers);
        Collections.sort(listNumbers);
        System.out.println("Sorted list "+listNumbers);

        //Map sorting by keys
        Map<String, Integer> scores=new HashMap<>();
        scores.put("Charlie", 92);
        scores.put("Alice", 88);
        scores.put("Bob", 80);

        System.out.println("Original Map "+ scores);
        //sort map by keys
        Map<String, Integer> sortedMap=new TreeMap<>(scores);
        System.out.println("Sorted Map: "+sortedMap);

        //sort map by values
        List<Map.Entry<String, Integer>> entries=new ArrayList<>(scores.entrySet());
        entries.sort(Map.Entry.comparingByValue());
        System.out.println("Sorted by values: "+ entries);
    }

}
