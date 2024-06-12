package learning_java.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsecureInsertion {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/univ";
        String username = "root" ;
        String password = "Abhishek@1803" ;

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url , username , password) ;

        Statement stm = connection.createStatement();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter name , state and branch : ");

        String name = br.readLine();
        String state = br.readLine();
        int branch = Integer.parseInt(br.readLine());

        int rs = stm.executeUpdate("Insert into students(name , state , branch ) values(" + "'" + name +  "','" + state + "'," + branch + ");" );
        isr.close();
        connection.close();
    }
}
