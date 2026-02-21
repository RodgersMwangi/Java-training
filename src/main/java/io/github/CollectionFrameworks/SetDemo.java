package io.github.CollectionFrameworks;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        setOp();
    }
    public static void hashSetDemo(){
        Set<String> colors= new HashSet<>();
        //Set<Integer> numbers = new HashSet<>(20); - initial capacity
        //Set<Double> decimals = new HashSet<>(10, 0.75f) - initial capacity, load factor

        colors.add("blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("purple");
        colors.add("purple");

        System.out.println(colors);
        System.out.println(colors);
        colors.remove("Green");
        //.size()
        System.out.println(colors.isEmpty());
        System.out.println(colors.contains("purple"));

    }
    public static void linkedHashSet(){
        //maintains insertion order
        Set<String> lhs=new LinkedHashSet<>();
        lhs.add("Apple");
        lhs.add("Mango");
        lhs.add("Orange");

        System.out.println(lhs);  //maintain insertion order
        //.add()  .remove()

    }
    public static void setOp(){
        Set<Integer> setA=new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        //Union -all elements from both sides - no duplicates
        Set<Integer> union=new HashSet<>(setA);
        union.addAll(setB);
        System.out.println(union);

        //Intersection - common elements between the two sets
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println(intersection);

        //Difference - elements in A but not in B
        Set<Integer> diff = new HashSet<>(setA);
        diff.removeAll(setB);
        System.out.println(diff);

        //Sysmetric difference - elements in either but not in both
        Set<Integer> sysDiff= new HashSet<>(union);
        sysDiff.removeAll(intersection);
        System.out.println(sysDiff);



    }

}
