package io.github.Abstraction;

public class DatabaseConfig {
    private static String databaseUrl;
    private static String username;
    private static String password;
    private static boolean isInitialized;

    //static block- runs once when the class is loaded
    static{
        System.out.println("Loading database configuration...");
        databaseUrl="mysql/localhost:3306";
        username="Admin";
        password="secret";
        isInitialized=true;
        System.out.println("Database configuration loaded");
    }

    //static method
    public static void displayConfig(){
        if(isInitialized){
            System.out.println("Database Url: "+databaseUrl);
            System.out.println("Username: "+username);
        }
        else{
            System.out.println("Database not initialized");
        }
    }

}
