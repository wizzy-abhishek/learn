package learning_java.io_challenge;

import java.io.*;

public class CustomerIn {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        FileInputStream fis = new FileInputStream("P:\\Code\\learning\\challenge2\\CustData");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();
        Customer[] list = new Customer[length];

        for (int i = 0; i < length; i++) {
            list[i] = (Customer) ois.readObject();
        }

        System.out.print("Enter the name : ");
        String findName = br.readLine();

        for (int i = 0; i < length; i++) {
            if (findName.equalsIgnoreCase(list[i].name)) {
                System.out.println(list[i]);
            }
        }
        ois.close();
        fis.close();
        br.close();
        isr.close();
    }
}
