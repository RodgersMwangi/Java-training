package io.github.CollectionFrameworks;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println(names);
        names.add(2,"Jane");
        System.out.println(names);

        //LinkedList-specific operations
        names.addFirst("Wow");
        names.addLast("Lastone");
        System.out.println(names.getLast());

        names.removeLast();
        System.out.println(names);

        //Queue operations
        names.offer("Joppa");
        System.out.println("Peek: "+names.peek()); //view first
        System.out.println(names);
        System.out.println("Poll: "+names.poll()); //remove first
        System.out.println(names);

        
    }

}
