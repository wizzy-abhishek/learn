package learning.io_randomacess;

import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("P:\\Code\\learning\\IO_LEARNING\\RandomAccess", "rw");

        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        raf.write('e');
        raf.seek(raf.length());
        raf.write('I');
        byte[] arr = {'G' , 'H' ,'j'};
        raf.write(arr);
        raf.seek(raf.length());
        raf.write("\n".getBytes());
        raf.write('a');
        raf.seek(2);
        System.out.println(raf.getFilePointer());
    }
}
