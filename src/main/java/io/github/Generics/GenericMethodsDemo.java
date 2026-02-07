package io.github.Generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethodsDemo {
    public static void main(String[] args){
        GenericMethods util = new GenericMethods();

        //Using generic static methods
        String[] strings = {"Hello", "World", "Generics"};
        Integer[] numbers ={1,2,3,4,5};

        GenericMethods.printArray(numbers);

        //Using generic instance methods
        List<String> nameList=Arrays.asList("Alice", "Bob", "Charlie");
        String first=util.getFirstElement(nameList);
        System.out.println("First: "+first);

        List<Integer> numberList=Arrays.asList(10,20,30);
        Integer firstNum=util.getFirstElement(numberList);
        System.out.println("First Number: "+firstNum);

        //Using method with multiple type parameters
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        GenericMethods.printPair(pair);

        //Creating list with generic method
        List<String> newList=GenericMethods.createList("A", "B", "C");
        System.out.println("New List: "+newList);
    }

}
