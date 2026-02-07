package io.github.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.println(element + " ");
        }
        System.out.println();
    }

    //generic instance method
    public <T> T getFirstElement(List <T> list){
        if(list == null || list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    //generic method with multiple type parameters
    public static <K, V> void printPair(Pair <K, V> pair){
        System.out.println("Key: "+pair.getKey()+", Value: "+pair.getValue());
    }

    public static <T> List<T> createList(T... elements){
        List<T> list =new ArrayList<>();
        for(T element: elements){
            list.add(element);
        }
        return list;
    }

}
