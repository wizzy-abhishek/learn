package dsa;

import java.util.Scanner;

public class LinearSearch_InRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array :");
        for (int i = 0; i < size ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the element you wanna search : ");
        int element = in.nextInt();
        System.out.println("Enter your range : ");
        int initial = in.nextInt();
        int end = in.nextInt();
        System.out.println(isElement(arr , element , initial , end));
    }
    public static int isElement(int[] arr , int element , int initial , int end){
        for (int i = initial; i < end ; i++) {
            if(arr[i] == element){
                return i ;
            }
        }
        return Integer.MIN_VALUE;
    }
}
