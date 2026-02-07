package io.github.CollectionFrameworks;
import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        /*accepts one null
        no duplicates
        no iteration order

        */


        Set<String> names= new HashSet<>();
        Set<Double> values=new HashSet<>(10, 0.75f); //once 75% of the 
        names.add("David"); // initial size is filled increase the capacity
        names.add("John");
        names.add("Nick");
        names.add("David");

        System.out.println(names);
        //check values
        System.out.println(names.contains("Nick"));
        //remove values
        System.out.println(names.remove("Nick"));
        System.out.println(names.size());
        //names.clear();
        System.out.println(names.isEmpty());

        //iteration
        Iterator <String> iterator = names.iterator();
        while(iterator.hasNext()){
            String name=iterator.next();
            System.out.println(name);
        }

        names.forEach(name-> System.out.println(name));
    }

}
