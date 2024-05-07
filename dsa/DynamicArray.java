package dsa;

public class DynamicArray {
    // In dynamic array column size is not fixed\
    public static void main(String[] args) {
        int[][] array = {
            {1,2,3},
            {5,6},
            {7,8,9,10}
        };
        for (int row = 0; row < array.length ; row++) {
            for(int col = 0 ; col < array[row].length ; col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Enhanced for loop ");
        for(int[] arr : array){
            System.out.println();
            for(int number : arr){
                System.out.print(number + " ");
            }
        }
    }

}
