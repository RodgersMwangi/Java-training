package io.github.CollectionFrameworks;
import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> setA=new HashSet<>();
        Set<Integer> setB=new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        System.out.println("Set A: "+setA);
        System.out.println("Set B: "+setB);

        //Union - all elements from both sets, no duplicates
        Set <Integer> union=new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union: "+union);

        //Intersection - common elements
        Set <Integer> intersection=new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: "+ intersection);

        //Difference - elements in A but not in B
        Set <Integer> difference=new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference: "+difference);

        //Symmetric Difference - elements in either but not in both
        Set <Integer> symmetricDiff=new HashSet<>(union);
        symmetricDiff.removeAll(intersection);
        System.out.println("Symmetric difference: "+symmetricDiff);

    }

}
