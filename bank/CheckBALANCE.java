package bank;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckBALANCE {
    public int giveBALANCE() throws IOException {
        FileInputStream fis = new FileInputStream("P:\\Code\\bank\\data\\Abhi0648Balance");
        AccountInfo ObjBal = new AccountInfo();
        byte[] bal = new byte[fis.available()];
        fis.read(bal);
        String bal1 = new String(bal);
        int realBal = Integer.parseInt(bal1);
        ObjBal.setBalance(realBal);
        fis.close();
        return realBal ;

    }
    public void showBal() throws IOException {
        System.out.println("Your Account Balance is : " + giveBALANCE());
    }
}