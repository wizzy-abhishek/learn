package dsa;

import java.util.Scanner;

public class LinearSearch_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the element you wanna search :");
        int target = in.nextInt();
        int indices = linearSearch(arr , target);
        System.out.println("Element found at : " + indices + " index");
    }
    public static int linearSearch(int[] arr , int target){
        if (arr.length == 0){
            return Integer.MIN_VALUE ;
        }
        for (int i = 0; i < arr.length ; i++) {
           if(arr[i] == target){
               return i ;
           }
        }
        return Integer.MIN_VALUE;
    }
}
