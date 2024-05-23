package learning;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IoPractice {
    public static void main(String[] args) throws IOException {
        File file = new File("P:\\Code\\learning\\IO_LEARNING\\io_practice.txt");
        if(!isFile(file)){
            file.createNewFile();
        }
        Scanner in = new Scanner(System.in);
        FileOutputStream fis = new FileOutputStream("P:\\Code\\learning\\IO_LEARNING\\io_practice.txt");
        System.out.println("Enter your text : ");
        String str = in.nextLine();
        writeInfile(fis , str);
    }
    static boolean isFile(File file ){
        return file.exists();
    }

    static void writeInfile(FileOutputStream fis , String str){
        byte[] data = str.getBytes();
        try {
            for (byte in : data) {
                fis.write(in);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
