package io.github.CollectionFrameworks;

import java.util.*;

public class LinkedListAsQueue {
    public static void main(String[] args) {

        //As a Queue (FIFO)
        Queue<String> queue=new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("Queue: "+queue);
        System.out.println("Next: "+queue.peek()); //Views first
        System.out.println("Process: "+queue.poll()); //removes first

        //As a Stack (LIFO) -using Deque
        Deque<String> stack= new LinkedList<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.poll());
        System.out.println(stack);
        System.out.println(stack.pop()); //removes first
        System.out.println(stack);
        
    }

}
