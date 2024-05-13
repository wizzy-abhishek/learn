package learning;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Io_File {
    public static void main(String[] args) throws IOException {
        File file = new File("P:\\Code\\learning\\IO_LEARNING\\auto.txt");
        Scanner in = new Scanner(System.in);
        /*
        File file = new File("auto.txt") create a reference to the same directory
        This line doesn't mean we are creating a file name auto in that directory
        This lines simply say any action to file obj will affect the that thing passed as argument
         */
        boolean isFile = file.isFile();
        System.out.println(isFile);
        if(isFile){
            FileWriter writer = new FileWriter(file , true);
            String datawriter = in.nextLine();
            writer.write(datawriter);
        }
        if(!isFile){
           try {
               file.createNewFile();
               System.out.println("File created ");

           }catch (IOException e){
               System.out.println("Couldn't create a file ");
           }
        }
        
    }
}
