package learning_java.io_challenge;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CustomerOut {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("P:\\Code\\learning\\challenge2\\CustData");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Customer[] list = {new Customer("Abhishek" , "8235772633"), new Customer("Police" , "100")};

        oos.writeInt(list.length);
        for (Customer c : list){
            oos.writeObject(c);
            oos.flush();
        }
        oos.flush();

        oos.close();
        fos.close();
    }
}
