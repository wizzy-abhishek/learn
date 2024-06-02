package learning_java.io_challenge;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class C2firstOut {
    public static void main(String[] args) throws Exception {

        FileOutputStream fis = new FileOutputStream("P:\\Code\\learning\\challenge2\\Data.txt");
        DataOutputStream dos = new DataOutputStream(fis);

        float[] values = {84.6f , 6.84f , 108.108f , 80.5f};
        int size = values.length;
        dos.writeInt(size);
        for (float f : values){
            dos.writeFloat(f);
            dos.flush();
        }
        dos.close();
        fis.close();
    }
}
