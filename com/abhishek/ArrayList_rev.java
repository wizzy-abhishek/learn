package com.abhishek;

import java.util.ArrayList;
import java.util.Scanner;

// Code not working

public class ArrayList_rev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(0);
        int entry = in.nextInt();
        while(entry != -1){
            list.add(entry);
        }
        int size = list.size();
        rev(list , 0 , size - 1);
    }
    public static void rev(ArrayList<Integer> list , int first , int last){
        while(first <= last){
            int temp = list.get(first);
            int lasttemp = list.get(last);
            list.add(first , lasttemp);
            list.add(last, temp);
            first++ ;
            last-- ;
        }
    }
}
