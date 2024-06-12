package learning_java.combination;

import java.io.*;
import java.sql.*;
import java.util.Arrays;
import java.util.HashMap;

class Student implements Serializable {
    int roll ;
    String name ;
    String state ;
    int branchNum ;

    public Student(){

    }

    public Student(int roll ,String name ,String state ,int branchNum){
        this.roll = roll ;
        this.name = name ;
        this.state = state ;
        this.branchNum = branchNum ;
    }

    public String toString(){
        return "roll " + roll +" -> name " + name + " -> state " + state + " -> branchNum " + branchNum ;
    }
}

public class Database {
    public static final String url = "jdbc:mysql://localhost:3306/univ";
    public static final String username ="root";

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Class.forName("com.mysql.cj.jdbc.Driver");


        System.out.println("Enter passcode for database");
        String passcode = br.readLine();
        br.close();

        Connection con = DriverManager.getConnection(url , username , passcode);
        PreparedStatement pstm = con.prepareStatement("select * from students");
        ResultSet rs = pstm.executeQuery();

        HashMap<Integer , Student> hm = new HashMap<>();

        writeStudentData(rs , hm);

        con.close();

        readStudentData(hm);
    }

    public static void writeStudentData(ResultSet rs , HashMap<Integer , Student> hm){
        try {
            while(rs.next()){
                int roll = rs.getInt("roll");
                String name = rs.getString("name");
                String state = rs.getString("state");
                int branchNum = rs.getInt("branch");

                Student adding = new Student(roll , name , state , branchNum);
                hm.put(roll , adding);
            }
        }catch(SQLException e){
            System.out.println("Some Error while letting data in " + Arrays.toString(e.getStackTrace()));
        }


    }
    public static void readStudentData(HashMap<Integer , Student> hm){
        try {
            FileOutputStream fos = new FileOutputStream("P:\\Code\\learning_java\\combination\\Database");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(hm.size());
            for (Student stu : hm.values()) {
                oos.writeObject(stu);
            }
            fos.close();
        }catch (IOException e){
            System.out.println("Sorry for inconvenience in fos " + Arrays.toString(e.getStackTrace()));
        }
    }
}
