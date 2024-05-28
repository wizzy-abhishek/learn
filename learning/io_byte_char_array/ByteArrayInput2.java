package learning.io_byte_char_array;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayInput2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("P:\\Code\\learning\\IO_LEARNING\\Passcode");
        byte[] arr = new byte[fis.available()];
        fis.read(arr);
        ByteArrayInputStream bis = new ByteArrayInputStream(arr);
        String str = new String(bis.readAllBytes());
        System.out.println(str);
        System.out.println("Is reading from file mark supported : " + fis.markSupported());
        System.out.println("Is reading from byte array mark supported : " + bis.markSupported());
        fis.close();
        bis.close();
    }
}
