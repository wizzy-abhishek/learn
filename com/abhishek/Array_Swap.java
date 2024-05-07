package com.abhishek;

import java.util.Scanner;

public class Array_Swap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter 10 elements : ");
        for (int i = 0; i < 10 ; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i <10 ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the position you wanna reverse : ");
       // System.out.println("Remember array indices structure.");
        System.out.println("It follows normal numbering ");
        int x = in.nextInt();
        int y = in.nextInt();
        swap(arr , x , y );
        for (int i = 0; i <10 ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int[] arr , int first , int second){
        int temp = arr[first - 1] ;
        arr[first - 1] = arr[second - 1] ;
        arr[second - 1] = temp ;
    }

}
