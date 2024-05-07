package dsa;

import java.util.ArrayList;
import java.util.Scanner;

    // Time complexity of Arraylist is constant O(1)
    // ArrayList is slower than Array
    /*  Initially ArrayList also has fixed size but as it gets filled to some extent
        It creates a new ArrayList of bigger size and copy old elements in the newer one
    */
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList(10);
        /*
        Here we have to pass wrapper classes , we cant pass primitives from this
         */
       // ArrayList<String> name = new ArrayList<>(0);
       /*
       ArrayList<ArrayListExample> together = new ArrayList<>(0);
       ArrayListExample obj = new ArrayListExample();
       */
        boolean entry = true ;
        // int count = 0 ;
        System.out.println("To stop enter -1 ");
        while(entry){
            int number = in.nextInt();
            // String naam = in.nextLine();
            if(number == -1){
                break;
            }
            list.add(number);
            // name.add(String.valueOf(name));
            // together.add(list , name);
            // count++ ;
        }
        for(int number : list){ // Can we Iterate two elements at a time
            System.out.print(number + " ");
        }
        System.out.println("\n" + list);
        /*
        for (int i = 0; i <count ; i++) {
            System.out.println(list.get(i) + " : " + name.get(i));
        }
        */
    }
}