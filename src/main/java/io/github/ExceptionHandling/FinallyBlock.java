package io.github.ExceptionHandling;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        scenario3();
    }
    public static void scenario1(){
        try{
            System.out.println("Try-Block, no exception");
        }catch(Exception e){
            System.out.println("Catch block");
        }finally{
            System.out.println("Finally block - always executes");
        }
    }
    public static void scenario2(){
        try{
            System.out.println("Try-block, before exception");
            int result=10/0; 
            System.out.println("Try block - after exception");
        }catch(ArithmeticException e){
            System.out.println("Catch block, exception handled");
        }finally{
            System.out.println("Finally block always executes");
        }
        System.out.println("Will this execute?");
    }
    public static void scenario3(){
        try{
            System.out.println("Try block - before exception");
            int[] arr = new int[5];
            arr[10]=50; //Array Index out of Bounds
        }catch(ArithmeticException e){
            System.out.println("Wrong exception to catch");
        }finally{
            System.out.println("Finally block - Executes even with uncaught exception");
        }
    }

}
