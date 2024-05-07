package dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialization
        for(int i = 0 ; i < 3 ; i++){
            list.add(new ArrayList<>());
        }
        // If we do not initialize our multi arraylist we will get error
        // By initializing an arraylist we can tell compiler get to (i th ) list
        // Else its empty

        //adding value
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
             list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
