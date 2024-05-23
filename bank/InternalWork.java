package bank;

import java.util.Scanner;
import java.util.InputMismatchException;

class NetBankingException extends RuntimeException {
    NetBankingException() {
        super("THERE MIGHT BE ANY ERROR !!! ");
    }
}

public class InternalWork {
    Credentials objCred = new Credentials();
    AccountInfo ObjBal = new AccountInfo();
    WithdrawalAction objWithdraw = new WithdrawalAction();
    DepositAmt objDeposit = new DepositAmt();

    public InternalWork() {
        Scanner input = new Scanner(System.in);

        objCred.setAccNumber("Abhi0684"); // FOR NOW LET IT BE THIS
        objCred.setPasscode("Java@1234");
        objCred.setUserMobNumber(82357726);

        System.out.println("Enter your UNIQUE IDENTIFICATION NUMBER : ");
        String uniqueID = input.nextLine();
        System.out.println("ENTER PASSCODE");
        String passcode = input.nextLine();

        if (passcode.equals(Credentials.getPasscode()) && uniqueID.equals(Credentials.getAccNumber())) {

            ObjBal.setBalance(100000);

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
                    System.out.println("Your Account Balance is : " + AccountInfo.getBalance());
                } else if (userChoice.equalsIgnoreCase(deposit) || userChoice.equalsIgnoreCase(B)) {
                    System.out.println("Enter the amount you want to deposit : ");
                    int DepoAmt = input.nextInt();
                    objDeposit.Deposit(DepoAmt);
                } else if (userChoice.equalsIgnoreCase(withdrawal) || userChoice.equalsIgnoreCase(C)
                        || userChoice.equalsIgnoreCase(transfer)) {
                    System.out.println("Enter the amount you want to objWithdraw : ");
                    int WithdAmt = input.nextInt();
                    objWithdraw.withdrawal(WithdAmt);
                } else if (userChoice.equalsIgnoreCase(uniqueID_fetch) || userChoice.equalsIgnoreCase(D)) {
                    System.out.println("ITS A PRIVATE CREDENTIAL TO SEE IT ENTER YOUR MOB NUM : ");
                    int verificationNum = input.nextInt();
                    if (verificationNum == Credentials.getUserMobNUmber()) {
                        System.out.println("YOUR UNIQUE IDENTIFICATION VALUE is : ");
                        System.out.println(Credentials.getAccNumber());
                    }
                } else if (userChoice.equalsIgnoreCase(change_passcode) || userChoice.equalsIgnoreCase(E)) {
                    System.out.println("Do You really want to change the password ?");
                    String finalpasswordchangeOption = input.nextLine();
                    if (finalpasswordchangeOption.equalsIgnoreCase(Yes)) {
                        System.out.println("Enter your mobile number : ");
                        int verificationNumPass = input.nextInt();
                        if (verificationNumPass == Credentials.getUserMobNUmber()) {
                            System.out.flush();
                            System.out.println("OKAYYY OKAYYY YOU CAN CHANGE THE PASSWORD ");
                            System.out.println(
                                    "BUT I AM LEARNING JDBC TILL THEN YOU HAVE TO CHANGE INSIDE THE PROGRAM : ");
                            input.nextLine();
                            String userPassCODE = input.nextLine();
                            objCred.changePassword(userPassCODE);
                            System.out.println(Credentials.getPasscode());// This line isnt working
                            System.out.println("YOUR PASSWORD HAS BEEN CHANGED ");
                        }else {
                            System.out.println("RETRY MAYBE SOME ERROR ");
                        }
                    }

                }
            } catch (NetBankingException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException c) {
                System.out.println("Entered a wrong input ");
            } finally {
                System.out.println("THANK YOU FOR USING OUR Net Banking");
                System.out.println("YOUR MONEY IS SAFE WITH US ");
                input.close();
            }
        } else if (!passcode.equals(Credentials.getPasscode())) {
            System.out.println("PASSWORD IS WRONG !!!!");
        } else {
            System.out.println("UNIQUE ID IS WRONG !!!!");
        }
    }
}
