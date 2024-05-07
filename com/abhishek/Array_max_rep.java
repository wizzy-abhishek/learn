package com.abhishek;

import java.util.Arrays;

public class Array_max_rep {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,2,1,5,6,8,2,1,8,2,8,9,8,5,7,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,1,5,2,2,5,2,5,4,6,5,6,1,1,1,1,1,1,1,1,1,1,1,1,1};
        repoCount(arr);
    }
    public static void repoCount(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int maxElement = 0;
        int maxCount = 0 ;
        int count = 0 ;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] == arr[i+1]){
                count++ ;
            }
            if(arr[i] != arr[i+1] /* && maxCount < count*/ ){
               if(maxCount < count + 1)
               {    maxCount = count + 1 ;
                   maxElement = arr[i];
               }
               count = 0 ;
            }
        }
        System.out.println("The maximum repeated element is : " + maxElement);
        System.out.println("It is repeated  " + maxCount + " times ");
    }
}
