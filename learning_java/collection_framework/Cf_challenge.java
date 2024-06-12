package learning_java.collection_framework;


import java.io.*;
import java.util.HashMap;

/*
 Use HashMap
    1. Create an Account
    2. Delete an Account
    3. View Acc
    4. View all Acc
    5. Save Acc
    6. Exit
 */

class Account implements Serializable {

    String accNum ;
    private String name ;
    private double balance ;

    public Account(String accNum ,String name , double balance){
        this.accNum = accNum  ;
        this.name = name ;
        this.balance = balance ;
    }

    public Account() {

    }

    public String toString(){

        return "The Account detail of : " + accNum + " are \n"+
                "Holder Name : " + name + "\n" +
                "Balance : " + balance + "\n";
    }
}

public class Cf_challenge {

    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        HashMap<String, Account> hm = new HashMap<>();

        try {
            
            FileInputStream fis = new FileInputStream("P:\\Code\\learning_java\\collection_framework\\Account");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Account acc = null;

            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                acc = (Account) ois.readObject();
                hm.put(acc.accNum , acc);
            }
            ois.close();
            fis.close();
        }catch (IOException e){
            System.out.println("Some problem arrived " + e );
        }

        System.out.println("What do you want to do : " + "\n" +
                "    1. Create an Account \n" +
                "    2. Delete an Account\n" +
                "    3. View Acc\n" +
                "    4. View all Acc\n" +
                "    5. Save Acc\n" +
                "    6. Exit");

        Integer userValue = Integer.parseInt(br.readLine());

        if (userValue.equals(1)) {
            create(br , hm);

        }
        else if (userValue.equals(2))
        {
            delete(br , hm);
        }
        else if (userValue.equals(3))
        {
            viewAcc(br , hm);
        }
        else if (userValue.equals(4))
        {
            for (Account a : hm.values()) {
                System.out.println(a);
            }
        }
        else if (userValue.equals(6))
        {
            System.out.println("Thank you for using our service ");
        }
        else if (userValue.equals(5)) {
            System.out.println("All file saved.");
        }

        FileOutputStream fos = new FileOutputStream("P:\\Code\\learning_java\\collection_framework\\Account");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(hm.size());

        for (Account a : hm.values())
        {
            oos.writeObject(a);
        }
        br.close();
        isr.close();
    }
    public static void create (BufferedReader br , HashMap<String , Account > hm)throws Exception{
        System.out.println("Enter Account/Mobile number : ");
        String accountNumber = br.readLine();
        System.out.println("Enter the name : ");
        String name = br.readLine();
        System.out.println("Whats the initial balance : ");
        double balance = Double.parseDouble(br.readLine());
        Account created = new Account(accountNumber, name, balance);
        hm.put(accountNumber, created);
        System.out.println("Account created.");
    }

    public static void delete(BufferedReader br ,HashMap<String , Account > hm) throws Exception{
        System.out.println("Enter the account number you want to delete : ");
        String del = br.readLine();
        hm.remove(del);
    }
    public static void viewAcc(BufferedReader br ,HashMap<String , Account > hm) throws Exception{
        System.out.println("Enter the account number : ");
        String fetch = br.readLine();
        System.out.println(hm.get(fetch));
    }
}