package learning_java.io_buffered;

import java.io.*;

public class BufferedMark {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("P:\\Code\\learning\\IO_LEARNING\\auto.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

/*        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.println();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read()); // Gives null as output
        bis.reset();
        System.out.println();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());       */

        int x ;
        while ((x= bis.read()) != -1){
            if((char)x == 's'){
                bis.mark(10);
            }
            System.out.print((char)x);
            if ((char)x == 'a') {
                bis.reset();
            }
        }
        bis.close();
        fis.close();
    }
}
