package adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class HelloWorld {

    public HelloWorld() {
       
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Constructor called");  
        try (Scanner sc = new Scanner(System.in);
             Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","gopi","7730")) {
            System.out.println("Connection Created");    
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new HelloWorld();
    }
}

