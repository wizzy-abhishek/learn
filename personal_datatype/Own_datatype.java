package personal_datatype;

import java.util.ArrayList;
import java.util.Scanner;

public class Own_datatype {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.roll = 1 ;
        stu1.name = "Abhishek Anand" ;
        stu1.marks = 98;
        Student stu2 = new Student();
        stu2.roll = 2 ;
        stu2.name = "Gargi Parmar" ;
        stu2.marks = 99;
        try{
            ArrayList<Student> list = new ArrayList<>();
            list.add(stu1);
            list.add(stu2);
           /* for (Student student : list) {
                System.out.println(student.toString());
            }*/
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the roll number : ");
            int fetch = in.nextInt();
            System.out.println(list.get(fetch - 1));
        }catch(IndexOutOfBoundsException e){
            System.out.println("You don't have that much student ");
        }
    }
}
