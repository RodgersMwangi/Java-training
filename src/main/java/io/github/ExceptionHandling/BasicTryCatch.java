package io.github.ExceptionHandling;

public class BasicTryCatch {
    public static void main(String[] args) {
        try{
            int [] numbers ={1,2,3};
            System.out.println(numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
        System.out.println("Program continues running...");
    }

}
