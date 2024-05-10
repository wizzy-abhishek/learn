package com.abhishek;

import java.util.Scanner;

public class Array_MinValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        minValue(arr);
    }
    public static void minValue(int[] arr ){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum value is : " + min);
    }
}
