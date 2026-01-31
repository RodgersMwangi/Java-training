package io.github.ExceptionHandling;

public class MultipleTryCatch {
    public static void main(String[] args) {
        try{
            String input=args[0];
            int number=Integer.parseInt(input);
            int result=100/number;
            System.out.println("Result "+ result);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Provide a command line argument");
        }catch(NumberFormatException e){
            System.out.println("Error: Please provide a valid integer");
        }catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero");
        }catch(Exception e){
            System.out.println("Error: Something unexpected happened");
        }
        System.out.println("Program complete");
    }

}
