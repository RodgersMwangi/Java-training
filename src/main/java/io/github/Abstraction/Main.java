package io.github.Abstraction;

public class Main {

    static{
        System.out.println("StaticBlockDemo class loaded");
    }
    public static void main(String[] args) {
        System.out.println("Main method started");
        DatabaseConfig.displayConfig();
        System.out.println("Main method completed");
    }

}
