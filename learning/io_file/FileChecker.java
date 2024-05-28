package learning.io_file;

import java.io.File;
import java.util.Scanner;

import static learning.io_file.Io_File_Practice.isFile;

public class FileChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file name (with extension): ");
        String filename = in.next();
        File file = new File("P:\\Code\\learning\\IO_LEARNING\\" + filename );
        System.out.println(isFile(file));
    }
}
