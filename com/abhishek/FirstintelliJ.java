package com.abhishek;
import java.math.BigInteger;
import java.util.Scanner;

public class FirstintelliJ {
    public static void main(String[] args) {
        System.out.println("Heyyyy");
        System.out.println(10.0 / 3);
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println(name);
        int a = input.nextInt();
        BigInteger k = input.nextBigInteger();
        System.out.println(k);
        System.out.println(a);
        input.close();
    }
}
