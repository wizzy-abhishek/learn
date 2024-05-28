package bank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

class NetBankingException extends RuntimeException {
    NetBankingException() {
        super("THERE MIGHT BE ANY ERROR !!! ");
    }
}

public class InternalWork {
    Credentials objCred = new Credentials();
    CheckBALANCE objCheckBALANCE = new CheckBALANCE();
    WithdrawalAction objWithdraw = new WithdrawalAction();
    DepositAmt objDeposit = new DepositAmt();

    public InternalWork() throws IOException {
        Scanner input = new Scanner(System.in);

        FileInputStream fis = new FileInputStream("P:\\Code\\bank\\data\\Abhi0684");
        byte[] arr = new byte[fis.available()];
        fis.read(arr);
        String passcode = new String(arr);
        objCred.setAccNumber("Abhi0684"); // FOR NOW LET IT BE THIS
        objCred.setPasscode(passcode);
        objCred.setUserMobNumber(82357726);

        System.out.println("Enter your UNIQUE IDENTIFICATION NUMBER : ");
        String uniqueID = input.nextLine();
        System.out.println("ENTER PASSCODE");
        String UserPasscode = input.nextLine();

        if (UserPasscode.equals(Credentials.getPasscode()) && uniqueID.equals(Credentials.getAccNumber())) {

            // NOW TAKING USER INPUT FOR ITS CHOICE
            System.out.println("What DO YOU WANT TO DO ?");
            System.out.println("EITHER ENTER THE CORRESPONDING CHAR OR TYPE IT ");
            System.out.println("A. CHECK BALANCE ");
            String CheckBal = "CHECK BALANCE";
            String A = "A";
            System.out.println("B. DEPOSIT ");
            String deposit = "DEPOSIT";
            String B = "B";
            System.out.println("C. WITHDRAWAL / TRANSFER ");
            String withdrawal = "WITHDRAWAL";
            String transfer = "TRANSFER";
            String C = "C";
            System.out.println("D. WANT TO SEE YOUR UNIQUE ID ");
            String uniqueID_fetch = "WANT TO SEE YOUR UNIQUE ID";
            String D = "D";
            System.out.println("E. CHANGE PASSWORD");
            String change_passcode = "CHANGE PASSWORD";
            String E = "E";
            String Yes = "YES";
            String No = "No";
            String userChoice = input.nextLine();

            try {
                if (userChoice.equalsIgnoreCase(CheckBal) || userChoice.equalsIgnoreCase(A)) {
                    objCheckBALANCE.showBal();
                }
                else if (userChoice.equalsIgnoreCase(deposit) || userChoice.equalsIgnoreCase(B)) {
                    System.out.println("Enter the amount you want to deposit : ");
                    String DepoAmt = input.next();
                    objDeposit.Deposit(DepoAmt);
                }
                else if (userChoice.equalsIgnoreCase(withdrawal) || userChoice.equalsIgnoreCase(C)
                        || userChoice.equalsIgnoreCase(transfer)) {
                    System.out.println("Enter the amount you want to Withdraw : ");
                    String WithdAmt = input.next();
                    objWithdraw.withdrawal(WithdAmt);
                }
                else if (userChoice.equalsIgnoreCase(uniqueID_fetch) || userChoice.equalsIgnoreCase(D)) {
                    System.out.println("ITS A PRIVATE CREDENTIAL TO SEE IT ENTER YOUR MOB NUM : ");
                    int verificationNum = input.nextInt();
                    if (verificationNum == Credentials.getUserMobNUmber()) {
                        System.out.println("YOUR UNIQUE IDENTIFICATION VALUE is : ");
                        System.out.println(Credentials.getAccNumber());
                    }
                }
                else if (userChoice.equalsIgnoreCase(change_passcode) || userChoice.equalsIgnoreCase(E)) {
                    System.out.println("Do You really want to change the password ?");
                    String finalpasswordchangeOption = input.nextLine();
                    if (finalpasswordchangeOption.equalsIgnoreCase(Yes)) {
                        System.out.println("Enter your mobile number : ");
                        int verificationNumPass = input.nextInt();
                        if (verificationNumPass == Credentials.getUserMobNUmber()) {
                            input.nextLine();
                            System.out.println("Enter new UserPasscode : ");
                            String newPassword = input.nextLine();
                            FileOutputStream fos = new FileOutputStream("P:\\Code\\bank\\data\\Abhi0684");
                            byte[] newPasscode = newPassword.getBytes();
                            for(byte b : newPasscode){
                                fos.write(b);
                            }
                            System.out.println("Changed 😁");
                        }else {
                            System.out.println("RETRY MAYBE SOME ERROR ");
                        }
                    }

                }
            } catch (NetBankingException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException c) {
                System.out.println("Entered a wrong input ");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("THANK YOU FOR USING OUR Net Banking");
                System.out.println("YOUR MONEY IS SAFE WITH US ");
                input.close();
            }
        } else if (!UserPasscode.equals(Credentials.getPasscode())) {
            System.out.println("PASSWORD IS WRONG !!!!");
        } else {
            System.out.println("UNIQUE ID IS WRONG !!!!");
        }
    }
}
