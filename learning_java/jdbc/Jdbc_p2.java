package learning_java.jdbc;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Jdbc_p2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/univ";
        String username = "root";
        String password = "Abhishek@1803";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url , username , password);

        PreparedStatement s = con.prepareStatement("select * from students where branch=?");

        //ResultSet rs = s.executeQuery("select * from dept");
        //ResultSet rp = s.executeQuery("select roll , name , state , branch from students");
        System.out.println("Enter dept number : ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int branchNum = Integer.parseInt(br.readLine());

        s.setInt(1, branchNum);
        ResultSet rp = s.executeQuery();
        int roll ;
        String name ;
        String state ;

        while(rp.next()){
            roll = rp.getInt("roll");
            name = rp.getString("name");
            state = rp.getString("state");

            System.out.println(roll + " " + name + " " + state + " ");

        }
        con.close();
        isr.close();
    }
}
