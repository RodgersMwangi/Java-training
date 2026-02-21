package io.github.CollectionFrameworks;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        hashMapDemo();
    }
    public static void hashMapDemo(){
        Map<String, Integer> studentsGrades=new HashMap<>();
        //Map<String, Integer> studentsGrades=new HashMap<>(20);
        //Map<String, Integer> studentsGrades=new HashMap<>(10, 0.75f);

        studentsGrades.put("Alice", 95);
        studentsGrades.put("Bob", 80);
        studentsGrades.put("Charlie", 85);
        studentsGrades.put("Alice", 92);

        System.out.println(studentsGrades);
        System.out.println(studentsGrades.get("John")); //null

        System.out.println(studentsGrades.containsKey("Bob"));
        System.out.println(studentsGrades.containsValue(86));
        System.out.println(studentsGrades.putIfAbsent("John", 77));
        System.out.println(studentsGrades.putIfAbsent("Charlie", 66));
        System.out.println(studentsGrades);

        for(int grade: studentsGrades.values()){
            System.out.println(grade);
        }
        for(String name: studentsGrades.keySet()){
            System.out.println(name);
        }
    }
    


}
