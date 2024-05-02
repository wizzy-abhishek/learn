package com.abhishek;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Enter a particular number : ");
         int particularNumber = in.nextInt();
        System.out.println(isArmstrong(particularNumber));
        System.out.println("Enter your range : ");
        int init = in.nextInt();
        int finish = in.nextInt();
        for (int i = init; i <= finish ; i++) {
            isArmstrongloop(i);
        }
    }
    static void isArmstrongloop(int f ){
        if(isArmstrong(f))
            System.out.println(f);
    }
    static boolean isArmstrong(int number){
        int mainNumber = number ;
        int arms = 0 ;
        while(number > 0){
            int r = number % 10 ;
            number /= 10 ;
            arms = arms + r*r*r ;
        }
        return arms == mainNumber ;
    }
}
