package io.github.IteratorCC;
import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args){
        List <String> cities = new ArrayList<>();
        cities.add("Nairobi");
        cities.add("Moscow");
        cities.add("New York");
        cities.add("London");

        ListIterator <String> listIterator= cities.listIterator();

        
        while(listIterator.hasNext()){
            String city=listIterator.next();
            System.out.println(city);
        }

        //if the next while is not present, you have to make the iterator start from the end of
        //the list  
        // ListIterator <String> listIterator= cities.listIterator(cities.size());

        while(listIterator.hasPrevious()){
            int index=listIterator.previousIndex();
            String city=listIterator.previous();
            System.out.println("index: "+index+ " city: "+city);
        }

        //modification during iteration
        listIterator=cities.listIterator();
        while(listIterator.hasNext()){
            String city=listIterator.next();
            if(city=="London"){
                listIterator.set("London, UK"); //modify the element
            }
            if(city=="New York"){
                listIterator.add("Manhattan"); //add after the element
            }

        }
        System.out.println(cities);
    }

}
