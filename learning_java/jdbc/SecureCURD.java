package learning_java.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
//import com.mysql.cj.jdbc.Driver ;


public class SecureCURD {
    static int executed ;

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/univ" ;
        String username = "root" ;
        String password = "123456789" ;

        Connection con = DriverManager.getConnection(url , username , password);

        showTable(con);

        System.out.println("What do you want to perform : \n Insertion  \n Deletion \n Updation  \n ");
        String userInput = br.readLine();

        if (userInput.equalsIgnoreCase("Insertion")){
            insertion(con);
        }
        if(userInput.equalsIgnoreCase("deletion")){
            deletion(con);
        }

        br.close();
        con.close();
    }
    public static void showTable(Connection con) throws SQLException {
        try (PreparedStatement pstm = con.prepareStatement("select * from students");
             ResultSet rs = pstm.executeQuery()) {
            while (rs.next()) {
                int roll = rs.getInt("roll");
                String name = rs.getString("name");
                String state = rs.getString("state");

                System.out.println(roll + " " + name + " " + state);
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving data: " + e.getMessage());
        }
    }


    public static void insertion(Connection con) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PreparedStatement pstm = con.prepareStatement("Insert into students(name , state , branch ) values(? , ? , ?);");

        System.out.println("Enter the name , state , branch : ");
        String name = br.readLine();
        String state = br.readLine();
        int branch = Integer.parseInt(br.readLine());

        br.close();

        pstm.setString(1 , name);
        pstm.setString(2, state);
        pstm.setInt(3, branch);


        executed = pstm.executeUpdate();
        con.close();
        //System.out.println(executed);
        if (executed > 0) {
            System.out.println("Done");
        }else{
            System.out.println("Some problem occurred");
        }
    }

    public static void deletion(Connection con) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PreparedStatement pstm = con.prepareStatement("delete from students where roll = ?");

        System.out.println("Enter the roll number ");

        int roll = Integer.parseInt(br.readLine());

        br.close();

        pstm.setInt(1, roll); // Set the roll number parameter

        int rowsDeleted = pstm.executeUpdate(); // Execute the deletion query

        if (rowsDeleted > 0) {
            System.out.println("Record deleted successfully!");
        } else {
            System.out.println("No record found with the given roll number.");
        }
    }

}
