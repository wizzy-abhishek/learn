package bank;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WithdrawalAction extends Banking_Interfaces_Withdrawal {
    @Override
    public void withdrawal(String withdrawalAmt) throws NetBankingException {
        CheckBALANCE obj = new CheckBALANCE();
        int withdraw = Integer.parseInt(withdrawalAmt);
        try {
            if (withdraw <= 0) {
                System.out.println("You are wasting resource and our time ");
            } else if (withdraw > 10000) {
                System.out.println("You can only objWithdraw upto 10000 once ");
            } else if (obj.giveBALANCE() < withdraw) {
                System.out.println("You only have : " + obj.giveBALANCE() + " in your account");
            } else {
                FileInputStream fis = new FileInputStream("P:\\Code\\bank\\data\\Abhi0648Balance");
                byte[] arr = new byte[fis.available()];
                fis.read(arr);
                String bal = new String(arr);
                int balance = Integer.parseInt(bal);
                int afterWithdrawal = balance - withdraw;
                System.out.println("You withdrew : " + withdraw);
                FileOutputStream fos = new FileOutputStream("P:\\Code\\bank\\data\\Abhi0648Balance");
                String balOut = new String(String.valueOf(afterWithdrawal));
                byte[] finalamt = balOut.getBytes();
                for (byte b : finalamt){
                    fos.write(b);
                }
                System.out.println("Your new balance is : " + obj.giveBALANCE());

                fis.close();
                fos.close();

            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}