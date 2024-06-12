package learning_java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.* ;

public class TestConnection {

    public static void main(String[] args) {
        // Replace with your database connection details
        String url = "jdbc:mysql://localhost:3306/univ";
        String username = "root";
        String password = "Abhishek@1803";

        try {
            // Load the MySQL Connector/J driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Get a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connection established successfully!");

            Statement stm = connection.createStatement();

            ResultSet rs = stm.executeQuery("select * from students");

            int branch;
            int roll ;
            String name ;
            String state;

            while (rs.next()) {
                roll = rs.getInt("roll");
                name = rs.getString("name");
                state = rs.getString("state");
                branch = rs.getInt("branch");

                System.out.println( roll + " " + name + " " + state + " " + branch);

                // Close the connection (optional - connection pool will handle it in production)

            }
            connection.close();
        }catch(SQLException | ClassNotFoundException e){
                throw new RuntimeException(e);
        }
    }
}