package learning;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Io_File_Creator {
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        Io_File_Creator obj = new Io_File_Creator();
        System.out.println("Enter the path : ");
        String address = ins.nextLine();
        System.out.println("Enter filename :");
        String filename = ins.nextLine();
        obj.create_file(address, filename);
    }

    private void create_file(String address , String filename){
        Scanner in = new Scanner(System.in);
        File file = new File(address );
        File createfile = new File(file + filename);
        boolean check = createfile.exists();
        if(check){
            System.out.println("File Already Exists !!!! ");
        }else{
            System.out.println("File doesn't exist. \n Do you want to create a file ? ");
            String yes = "YES";
            String input = in.nextLine();
            if(input.equalsIgnoreCase("YES")){
                try {
                    createfile.createNewFile();
                    System.out.println("File created success fully ");
                } catch (IOException e) {
                    System.out.println("Process failed ");
                }
            }
        }
    }
}
