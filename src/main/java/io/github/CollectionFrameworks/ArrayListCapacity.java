package io.github.CollectionFrameworks;
import java.util.*;

public class ArrayListCapacity {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(5);
        for(int i=1; i<=10; i++){
            numbers.add(i);
            System.out.println("Added "+i+" Size: "+numbers.size());
        }

        //for loop
        System.out.println("====for loop====");
        for(int j=0; j<numbers.size(); j++){
            System.out.println("Index: "+j+" Number: "+numbers.get(j));
        }

        //enhanced for loop
        System.out.println("====enhanced for loop====");
        for(int number : numbers){
            System.out.println("Number: "+ number);
        }

        //iterator
        System.out.println("\n====iterator=====");
        Iterator<Integer> iterator=numbers.iterator();
        while(iterator.hasNext()){
            Integer num=iterator.next();
            System.out.println("Number: "+num);
        }

        //forEach with lambda
        System.out.println("\n====forEach lambda====");
        numbers.forEach(numberr->System.out.println("Number: "+numberr));

        }
        

}
