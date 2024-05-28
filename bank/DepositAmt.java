package bank;

import java.io.FileOutputStream;
import java.io.IOException;

public class DepositAmt extends Banking_Abstract_Deposit {
    @Override
    public void Deposit(String depositAmount) throws IOException {

        try {
            CheckBALANCE obj = new CheckBALANCE();
            int afterDeposit = (obj.giveBALANCE() + Integer.parseInt(depositAmount));
            String depo = new String(String.valueOf(afterDeposit));
            FileOutputStream fos  = new FileOutputStream("P:\\Code\\bank\\data\\Abhi0648Balance");
            byte[] arr = depo.getBytes();
            for (byte b : arr) {
                fos.write(b);

            }
            System.out.println("Your new bal is : " + obj.giveBALANCE());
            fos.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
