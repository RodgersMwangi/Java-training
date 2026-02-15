package Exercises.javase019;

public class Main {
    public static void main(String[] args) {
        //Demo for calculator interface
        Calculator add=(s,t)->System.out.println(s+t);

        //Demo for Validator interface
        Validator validate=(input)->{
            if(input.trim().isEmpty()){
                System.out.println("Invalid input");
            }else{
                System.out.println("Valid input");
            }
        };

        //Demo for transformer interface
        Transformer trans=i-> Integer.toString(i);

        add.mathOperations(10, 30);
        validate.inputValidator(" ");
        System.out.println(trans.dataTransformer(10));

    }

}
