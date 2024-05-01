package com.abhishek;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        if(a > b && a > c){
//            System.out.println(a);
//        }else if (b > a && b > c){
//            System.out.println(b);
//        }else{
//            System.out.println(c);
//        }
        int max =  a ;
        if(max < b){
            max = b ;
        }
        if(max < c){
            max = c ;
        }
        System.out.println(max);

    }

}
