package io.github.javatraining;

public class contrlFlow {
    public static void main(String[] args){
        String grade ="F";
        String message = switch(grade){
            case "A","B"-> "Great Work";
            case "C" -> "Good Work";
            case "D" -> "Satisfactory";
            default -> {
                if(grade=="E"){
                    yield "Need Improvement";
                }else{
                    yield "Did not pass";
                }
            }
        };
        
        System.out.println("Your grade is "+grade +", "+message);

    }

}
