package com.abhishek;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1254537473/

import java.util.Scanner;

public class Even_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0 ; i < 5 ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(evenDigit(arr));

    }
    public static int evenDigit(int[] nums){
        int ifEven = 0 ;
        int count = 0 ;

        for (int j : nums) {
            int divison = j;
            while (divison != 0) {
                divison /= 10;
                count++;
            }
            if (count % 2 == 0) {
                ifEven++;
                count = 0;
            }
            count = 0;
        }
        return ifEven ;
    }
}
