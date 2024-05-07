package com.abhishek;

import java.util.Scanner;

public class Array_Rev {
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
        int x = 0 ;
        int y = arr.length - 1;
        reverse(arr , x , y );
        for (int i = 0; i <10 ; i++) {
            System.out.print("\n" + arr[i] + " ");
        }
    }
    public static void reverse(int[] arr , int first , int last){
        while(first <= last)
            {int temp = arr[first] ;
            arr[first] = arr[last ] ;
            arr[last] = temp ;
            first++ ;
            last-- ;
            }
    }

}
