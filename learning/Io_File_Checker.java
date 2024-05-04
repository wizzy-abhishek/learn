package learning;

import java.io.File;
import java.util.Scanner;

public class Io_File_Checker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your file name : ");
        String filename = in.nextLine();
        System.out.println(isFile(filename));
    }

    private static boolean isFile(String filename){
        File file = new File("P:\\Code\\learning\\IO_LEARNING\\" + filename);
        if(file.exists()){
            return true ;
        }
        return false ;
    }

}
