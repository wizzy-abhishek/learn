package learning;

import java.io.File;
import java.io.IOException;

public class Io_File {
    public static void main(String[] args) {
        File file = new File("P:\\Code\\learning\\IO_LEARNING\\auto.mp3");
        /*
        File file = new File("auto.txt") create a reference to the same directory
        This line doesn't mean we are creating a file name auto in that directory
        This lines simply say any action to file obj will affect the that thing passed as argument
         */
        boolean isFile = file.isFile();
        System.out.println(isFile);
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
