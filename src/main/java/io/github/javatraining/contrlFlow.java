package io.github.javatraining;

public class contrlFlow {
    public static void main(String[] args){
        int age = 65;
        boolean hasMembership=true;
        boolean hasID=true;

        if(age>0 && age<=2){
            System.out.println("An infant");
        }else if(age<=12){
            System.out.println("A child");
        }else if(age<=19){
            System.out.println("You are a teenager");
        }else if (age<=64){
            System.out.println("An adult");
        }else{
            System.out.println("You are a senior");
        }

    }

}
