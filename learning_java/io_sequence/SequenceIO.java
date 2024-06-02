package learning_java.io_sequence;

import java.io.*;

// In sequence input stream we can merge two files .

public class SequenceIO {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileInputStream fis2 = null;
        SequenceInputStream sis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("P:\\Code\\learning\\IO_LEARNING\\Text.txt");
            fis2 = new FileInputStream("P:\\Code\\learning\\IO_LEARNING\\Text0.txt");
            sis = new SequenceInputStream(fis, fis2);
            fos = new FileOutputStream("P:\\Code\\learning\\IO_LEARNING\\Destination.txt");
            int b;
            while ((b= sis.read()) != -1) {
                fos.write(b);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            fis.close();
            fis2.close();
            sis.close();
            fos.close();
        }
    }
}
