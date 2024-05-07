package com.abhishek;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        for (int value : arr) {
            /*
            We cant use this loop for modification or input from user or taking input as its functionality is to iterate
             */
            System.out.println(value);
        }
        // There is a array .toString() method to print array . It coverts array into String
    }
}