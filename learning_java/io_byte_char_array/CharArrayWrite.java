package learning_java.io_byte_char_array;

import java.io.CharArrayWriter;

public class CharArrayWrite {
    public static void main(String[] args) {
        CharArrayWriter caw = new CharArrayWriter();
        caw.write('a');
        caw.write('b');
        char[] arr = caw.toCharArray();
        for (char c : arr){
            System.out.print(c);
        }
    }
}
