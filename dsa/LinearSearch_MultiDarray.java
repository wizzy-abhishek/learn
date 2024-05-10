package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch_MultiDarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Row and Col : ");
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter your elements ");
        for (row = 0; row < arr.length ; row++) {
            for (col = 0 ; col < arr[row].length ; col++){
                arr[row][col] = in.nextInt();
            }
        }
        System.out.print("Enter the element you want to search : ");
        int element = in.nextInt();
        System.out.println(Arrays.toString(search(arr, element)));
    }
    static int[] search(int[][] arr , int element){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0 ; col < arr[row].length ; col++){
                if(arr[row][col] == element){
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }
}
