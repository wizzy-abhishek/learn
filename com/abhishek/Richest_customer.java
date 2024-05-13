package com.abhishek;

// https://leetcode.com/problems/richest-customer-wealth/description/

import java.util.Arrays;
import java.util.Scanner;

public class Richest_customer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < 3 ; row++){
            for (int col = 0; col < 3 ; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println(richConsumer(arr));
    }
    public static int richConsumer(int[][] arr){
        int max = 0 ;
        int personalMax = 0 ;
        for (int[] arrayRow : arr) {
            personalMax = 0 ;
            for(int wealth : arrayRow){
                personalMax += wealth ;
            }
            if(personalMax > max){
                max = personalMax ;
            }
        }
        return max ;
    }
}
