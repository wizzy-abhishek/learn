package learning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IoPractice2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        FileInputStream fis = new FileInputStream("P:\\Code\\learning\\IO_LEARNING\\Passcode");
        byte[] arr = new byte[fis.available()];
        fis.read(arr);
        String passcode = new String(arr);
        System.out.print("Enter the password : ");
        String userPasscode = in.nextLine();
        if(passcode.equals(userPasscode)){
            System.out.println("You got is Buddy");
            System.out.println("Lets Try this toooo : ");
            String userYes = in.next();
            if (userYes.equalsIgnoreCase("YES")){
                in.nextLine();
                System.out.println("Enter new passcode : ");
                String newPassword = in.nextLine();
                FileOutputStream fos = new FileOutputStream("P:\\Code\\learning\\IO_LEARNING\\Passcode");
                byte[] newPasscode = newPassword.getBytes();
                for(byte b : newPasscode){
                    fos.write(b);
                }
                System.out.println("Changed 😁");
            }
        }else{
            System.out.println("Wrong password ");
        }
    }
}
