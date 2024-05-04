package learning;

import java.io.File;
import java.io.IOException;

public class Io_File_Creation {
    public static void main(String[] args) {
        try {
            useFile("NEW File");
        } catch (IOException e) {
            System.out.println("File cant be created...Sorry");
        }
    }
    private static void useFile(String filename) throws IOException {
        File file = new File(filename);
        boolean fileExists = file.exists();

        System.out.println(" File : " + filename + fileExists);

        if(fileExists){
            System.out.println("Deleting file : " + filename) ;
            fileExists = file.delete();
        }

        if(!fileExists){
            try{file.createNewFile();
            } catch(IOException e){
                System.out.println("It went wrong !!!");
            }
            System.out.println("File created : " + filename);
            if(file.canWrite()){
                System.out.println("Would right a file ");
            }
        }
    }

}
