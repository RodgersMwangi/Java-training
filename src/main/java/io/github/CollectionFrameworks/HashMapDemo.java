package io.github.CollectionFrameworks;
import java.util.*;
/*
one null value key
no duplicate keys
no iteration order
 */

public class HashMapDemo {
    public static void main(String[] args) {
        Map <String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 83);
        studentGrades.put("Alice", 56);  //overwrites previous value

        System.out.println(studentGrades);
        System.out.println(studentGrades.get("Bob"));
        studentGrades.putIfAbsent("Winnie", 79);
        System.out.println(studentGrades.containsKey("Bib"));
        System.out.println(studentGrades.containsValue(56));

        studentGrades.remove("Charlie", 83);
        studentGrades.replace("Winnie", 90);
        studentGrades.replace("Bob", 92, 88);
        System.out.println(studentGrades);

        int count = studentGrades.getOrDefault("Alicew", 10);
        System.out.println("Count is "+count);

        //HashMap iteration
        System.out.println("====keys====");
        for(String name: studentGrades.keySet()){
            System.out.println("Name: "+name);
        }

        System.out.println("====values====");
        for(Integer grade: studentGrades.values()){
            System.out.println("Grade: "+grade);
        }

        System.out.println("====Entries====");
        for(Map.Entry<String, Integer> entry: studentGrades.entrySet()){
            System.out.println("Name: "+entry.getKey()+" Grade: "+entry.getValue());
        }

        System.out.println("====forEach lambda====");
        studentGrades.forEach((name, grade) -> System.out.println("Grade: "+ grade+" Name: "+name));
    }

}
