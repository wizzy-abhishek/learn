package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search_Array {
    // The array must be sorted.
    /*
        1. Find the middle element
        2. Check i.e, target > mid if yes traverse in right
                                   else traverse in left
        3. If middle element == target (Item found)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY : ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("ENTER THE ELEMENT");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the element : ");
        int element = in.nextInt();
        System.out.println(binarySearch(arr , element));
    }
    public static int[] binarySearch(int[] arr , int element  ){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            //int mid = (start + end) / 2 ;
            int mid = start + (end - start) / 2 ;
            if(element > arr[mid]){
                start = mid + 1 ;
            }
            else if (element < arr[mid]) {
                end = mid - 1 ;
            }
            else if(element == arr[mid]) {
               return new int[] {arr[mid]};
            }/*else{
                System.out.println(element + " not belongs in the array.");
                break ;
            }*/
        }
        return null ;
    }
}
