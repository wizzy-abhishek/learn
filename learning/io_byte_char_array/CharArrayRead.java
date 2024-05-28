package learning.io_byte_char_array;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayRead {
    public static void main(String[] args) throws IOException {
        char[] arr = {'a','b','h','i'};
        CharArrayReader car = new CharArrayReader(arr);
        int x ;
        while((x=car.read()) != -1){
            System.out.print((char)x);
        }
        car.close();
    }
}
