package learning_java.io_byte_char_array;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInput {

    public static void main(String[] args) throws IOException {
        byte[] b = {'a', 'b', 'h', 'i'}; // For now this is in same program but in real world it
        // might come from any source .
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        //String str = new String(bis.readAllBytes());
        //System.out.println(str);
        int x;
        while ((x = bis.read()) != -1) {
            System.out.print((char)x);
        }
        bis.close();
        // we can take from any one method only because as input stream reference gives the
        // data to one method the data is no more available in bis
    }
}