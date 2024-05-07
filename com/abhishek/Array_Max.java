package com.abhishek;

import java.util.Scanner;

public class Array_Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 array : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        max(arr);
    }
    public static void max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The max value is " + max);
    }
}
