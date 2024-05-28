package learning.io_challenge;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class C2firstIn {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("P:\\Code\\learning\\challenge2\\Data.txt");
        DataInputStream dis = new DataInputStream(fis);
        float data ;
        int size = dis.readInt();
        for (int i = 0; i < size ; i++) {
            data = dis.readFloat();
            System.out.println(data);
        }

        dis.close();
        fis.close();
    }
}
