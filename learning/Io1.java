package learning;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Io1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fileOut = new FileOutputStream("P:/Code/learning/IO_LEARNING/Text.txt");
            FileOutputStream fileOut3 = new FileOutputStream("P:/Code/learning/IO_LEARNING/Text1.txt");
            FileOutputStream fileOut2 = new FileOutputStream("P:/Code/learning/IO_LEARNING/Text0.txt");
            FileWriter fw = new FileWriter("P:/Code/learning/IO_LEARNING/TextFR.txt");


            String str = "I am be best S/W ENGINEER ";
            String str1 = "Keep Learning" ;


            byte[] arr =str1.getBytes();
            char[] arr2 = str.toCharArray();

            fileOut.write(str.getBytes(StandardCharsets.UTF_8));
            for(byte b : arr){
                fileOut2.write(b);
            }
            fileOut3.write(arr,5,str1.length() - 5);

            for(char c : arr2) {
                fw.write(c);
            }

            fileOut.close();
            fileOut3.close();
            fileOut2.close();
            fw.close();

        } catch(IOException e){
            System.out.println(e);
        }
    }
}
