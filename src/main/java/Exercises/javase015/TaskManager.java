package Exercises.javase015;

import java.util.*;

public class TaskManager {
    static LinkedList<Task> tasks= new LinkedList<>();
    public static void main(String[] args) {
        


    }
    public static void addTask(Task k){
        tasks.add(k);
    }
    public static void completeTask(Task k){
        k.setCompleted(true);
        tasks.poll();
    }
    public static void getNextTask(){
        
    }

}
