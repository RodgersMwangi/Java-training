package io.github.javatraining;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your height in m?");
        double height = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What is your weight in kgs?");
        double mass = scanner.nextDouble();
        double heightsqr=height*height;
        double BMI = mass/heightsqr;

        System.out.println("Your BMI is "+ BMI);

        scanner.close();
    }

}
