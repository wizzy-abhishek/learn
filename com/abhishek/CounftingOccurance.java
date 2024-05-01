/*
I have to count that how many times any digit is occurring
 */

package com.abhishek;

import java.math.BigInteger;
import java.util.Scanner;

public class CounftingOccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the main number : ");
        int number = in.nextInt();
        System.out.println("Enter the digit you wanna count :");
        int digit = in.nextInt();
        int store = 0 ;
        int count = 0 ;
        while(number != 0){
            store = number % 10 ;
            if(store == digit){
                count++ ;
            }
            number /= 10 ;
        }
        System.out.println(count);
    }
}
