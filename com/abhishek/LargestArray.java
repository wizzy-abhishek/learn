package com.abhishek;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = in.nextInt();
        System.out.println("Enter values of array : ");
        int[] arr = new int[size];
        int max = 0 ;
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The maximum in the given array is " + max);
    }
}
