package com.abhishek;

import java.util.Arrays;

public class Array_Rotation{

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3 ;
        rotate(arr , k);
    }

    public static void rotate(int[] nums, int k) {
        for(int i = 1 ; i <= k ; i++){
            int temp = 0 ;
            int last = nums.length-1;
            temp = nums[last] ;
            while(last >= 0){
                if(last == 0){
                    nums[last] = temp ;
                }
                else{
                nums[last] = nums[last -1];
                }
                last-- ;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
/*
This code is not optimized , I have to solve this with different approach
 */