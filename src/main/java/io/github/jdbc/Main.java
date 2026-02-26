package io.github.jdbc;
import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Connection insertionconnection=getMySQLConnection();
        Connection queryconnection=getMySQLConnection();
        Connection updateconnection=getMySQLConnection();
        Connection deleteconnection=getMySQLConnection();
        
        //insert(insertionconnection);
        update(updateconnection);
        delete(deleteconnection);
        databaseQuery(queryconnection);
        
        
        
        
    }
    private static void delete(Connection deleteconnection) {
        String sql = "delete from students where registration_number=?";
        try(
            //statement
            Connection connection=deleteconnection;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setString(1, "34277");
            preparedStatement.executeUpdate();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    private static void update(Connection updateconnection) {
        String sql = "update students set first_name=? where registration_number=?";
        try(
            Connection dbConnection=updateconnection;
            PreparedStatement preparedStatement=dbConnection.prepareStatement(sql);
        ){
            preparedStatement.setString(1, "Alice");
            preparedStatement.setString(2, "4353");
            preparedStatement.executeUpdate();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    private static void insert(Connection insertionconnection) throws SQLException{
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter your registration Number:");
            String regNo= scanner.nextLine();
            System.out.print("Enter your first name:");
            String firstName=scanner.nextLine();
            System.out.print("Enter your last name:");
            String lastName=scanner.nextLine();
            System.out.print("Enter your email:");
            String email=scanner.nextLine();
            System.out.print("Enter your password:");
            String password=scanner.nextLine();
            Student student = new Student(regNo, firstName,lastName,email,password);
            databaseInsertion(insertionconnection, student);
        }
    }
    private static void databaseInsertion(Connection connection, Student student) throws SQLException{
        String sql = "insert into students (registration_number, first_name, last_name, email, password) values (?,?,?,?,?)";

        try(
            //connection
            Connection dbConnection=connection;
            //statement
            PreparedStatement preparedStatement=dbConnection.prepareStatement(sql)
        ){
            preparedStatement.setString(1, student.getRegistrationNumber());
            preparedStatement.setString(2, student.getFirstName());
            preparedStatement.setString(3, student.getLastName());
            preparedStatement.setString(4, student.getEmail());
            preparedStatement.setString(5, student.getPassword());
            boolean execution = preparedStatement.execute();
            System.out.println(execution);
            
        }catch(SQLException e){
            System.out.println("Caught");
        }
    }

    private static void databaseQuery(Connection connection) throws ClassNotFoundException, SQLException{
        //query
        String query="select * from students";
        try(
            //Connection

            Connection dbconnection=connection;
            //Create a statement
            Statement statement=dbconnection.createStatement();
            
            ResultSet resultSet=statement.executeQuery(query);
        ){
            while(resultSet.next()){
                int id=resultSet.getInt(1);
                String registrationNumber=resultSet.getString(2);
                String firstName=resultSet.getString(3);
                String lastName=resultSet.getString(4);
                String email=resultSet.getString(5);
                String password = resultSet.getString(6);
                Student student=new Student(id, registrationNumber, firstName, lastName, email, password);
                System.out.println(student);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    private static Connection getMySQLConnection() throws ClassNotFoundException, SQLException{
         //load classname
        Class.forName("com.mysql.cj.jdbc.Driver");
        //register the driver
        DriverManager.registerDriver(new Driver());
        //establish a connection
        return DriverManager.getConnection(Config.DB_URL, Config.DB_USER, Config.DB_PASSWORD);
    }

}
