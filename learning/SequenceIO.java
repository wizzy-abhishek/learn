package learning;

import java.io.*;

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
            while (sis.read() != -1) {
                b = sis.read();
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
