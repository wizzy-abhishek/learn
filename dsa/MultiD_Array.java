package dsa;

import java.util.Arrays;
import java.util.Scanner;


public class MultiD_Array {
    public static void main(String[] args) {
        /*
        In 2-D array it's not necessary to give number of columns
        Like
        int[][] arr = new int[x][not necessary];

        1 2 3
        4 5 6
        7 8 9
        An array of arrays like in my case Array number X has its own array of not necessary numbered array
        Each not necessary array is an individual array whose address location is called by X array
        Again in 3-D array We have an array which an array of not necessary array which is itself an array of X array

         */
        int[][] array = {
                {1,2,3},
                {5,6},
                {7,8,9,10}
        };
        /*
        Because of that column are not that much necessary we can make array which have different sizes of each row array
        i.e,
         */
        System.out.println(Arrays.toString(array));
        // This line will give the address where the three array are stored
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));
        /*
        Taking user input in array.
        array.length gives the length of row
        array[iteration_variable_of_row] will give me the length of column (I think this way we can access dynamic array )
         */
        Scanner in = new Scanner(System.in);
        int[][] array_td = new int[3][4];
        for (int row = 0; row <array_td.length ; row++) {
            for (int col = 0; col < array_td[row].length ; col++) {
                array_td[row][col] = in.nextInt();
            }
        }

        System.out.println("Two for loops : ");
        for (int row = 0; row <array_td.length ; row++) {
            for (int col = 0; col < array_td[row].length ; col++) {
                System.out.print(array_td[row][col] + " " );
            }
            System.out.println();
        }

        System.out.println("Enhanced for loop and toString method :");
        // Now from enhanced for loop
        for(int[] arrays : array_td){
            System.out.println(Arrays.toString(arrays));
        }

        System.out.println("for loop and toString method :");
        //From toString() method in normal for loop
        for(int row = 0 ; row < array_td.length ; row++){
            System.out.println(Arrays.toString(array_td[row]));
        }

        System.out.println("Complete enhanced for loop :");
        for (int[] array2 : array_td ) {
            for(int number : array2){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
