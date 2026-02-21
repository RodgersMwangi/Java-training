package io.github.IteratorCC;

import java.util.*;

public class Fruits {
    public static void main(String[] args) {
        List <String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Grapes");

        Iterator <String> iterator = fruits.iterator();
        while(iterator.hasNext()){
            String fruit=iterator.next();
            if(fruit=="banana"){
                iterator.remove(); //safe removal
            }
            System.out.println(fruit);
            
        }
         
    }

}
