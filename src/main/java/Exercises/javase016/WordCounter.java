package Exercises.javase016;

/*
    PRACTISE EXERCISE 1
*/

import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String sentence="This is a trial sentence and it is testing this program.";
        Set<String> words=new LinkedHashSet<>();
        String[] words2=sentence.split("\\W+");
        for(String word: words2){
            System.out.println(word);
            words.add(word);
        }
        System.out.println(words);
        System.out.println("Count = "+words.size());
    }

}
