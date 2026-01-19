package io.github.javatraining;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] numbers = {10,21,65,35,85,37,53,99};
        int searchFor=37;
        for(int counter=0; counter<=numbers.length; counter++){
            System.out.println("Searching...");
            if(numbers[counter]==37){
                System.out.println("Found number 37");
                break;
            }
        }
        
    }
}
