package io.github.javatraining;

import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scanner.nextInt();
        System.out.println("Multiplication Table for "+ number);
        while(number<0){
            System.out.println("Please enter a positive number");
        }
        for(int i=0; i<=10; i++){
                System.out.println(number+ " * "+i +" = " + number*i);
            }
    }

}
