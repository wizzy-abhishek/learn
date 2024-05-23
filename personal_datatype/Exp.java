package personal_datatype;

import java.util.ArrayList;
import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many names you want to enter : ");
        ArrayList<Student> list = new ArrayList<>(0);
        int t = in.nextInt();
        while(t --> 0){
            System.out.println("Enter dname :");
            Department dname = Department.valueOf(in.next());
            System.out.println("Enter roll : ");
            int roll = in.nextInt();
            System.out.println("Enter first name : ");
            String name = in.next();
            System.out.println("Enter last name : ");
            String lastName = in.next();
            System.out.println("Enter marks : ");
            float marks = in.nextFloat();
            Student student = new Student(dname , roll , name , lastName , marks);
            list.add(student);
        }
        for(Student stu : list){
            System.out.println(stu.toString());
        }
    }
}
