package com.abhishek;

import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0 ;
        int b = 1 ;
        for(int i = 0 ; i <= 6 ; i++){
            System.out.println(a);
            int temp = b;
            b = a + b ;
            a = temp ;  // I have to practice it more efficiently
        }
        System.out.println("value of a at 7 is = " +  a);
        System.out.println("value of b = " +  b);
    }
}
