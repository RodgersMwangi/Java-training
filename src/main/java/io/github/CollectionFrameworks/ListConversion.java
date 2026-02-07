package io.github.CollectionFrameworks;

import java.util.*;

public class ListConversion {
    public static void main(String[] args) {
        String[] array={"apple", "Banana", "Orange"};
        List<String> listFromArray = Arrays.asList(array);
        System.out.println("List from array: "+listFromArray);
        //Arrays.asList will return fixed size list. Methods like add() will throw an exception

        //proper mutable list from array
        List<String> mutableList=new ArrayList<>(Arrays.asList(array));
        mutableList.add("grape");
        System.out.println("Mutable List: "+mutableList);

        //List to array
        String[] arrayFromList=mutableList.toArray(new String[0]);
        System.out.println("Array from list: "+Arrays.toString(arrayFromList));

        //with specific size
        String[] sizedArray = mutableList.toArray(new String[mutableList.size()]);
        System.out.println("Sized Array: "+Arrays.toString(sizedArray));

        
    }

    //generic method working with any List
        public static <T> void printList(List<T> list){
            for(T element : list){
                System.out.println(element + " ");
            }
            System.out.println();
        }

        //bounded generic method
        public static <T extends Number> double sumList(List<T> numbers){
            double sum=0;
            for(T number: numbers){
                sum+=number.doubleValue();
            }
            return sum;
        }

}
