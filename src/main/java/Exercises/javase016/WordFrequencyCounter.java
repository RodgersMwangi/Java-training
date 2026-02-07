package Exercises.javase016;
import java.util.*;

/*
    PRACTISE EXERCISE 2
*/

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Map<String, Integer> wordCount=new HashMap<>();
        String input = "This is a random sentence. It is being used as input for a demo. Just a short sentence";
        String[] words=input.split("\\W+");
        System.out.println(Arrays.toString(words));
        int counter=1;
        for(String word: words){
            
            if (wordCount.containsKey(word)){
                int count=wordCount.get(word);
                
                count+=1;
                System.out.println(wordCount.replace(word,count)); 
            }else{
                wordCount.put(word,counter);
            }
            
        }
        System.out.println(wordCount);
    }

}
