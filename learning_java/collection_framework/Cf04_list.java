package learning_java.collection_framework;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;
/*

It's LIFO
It extends Vector class
    Vector is similar to ArrayList  : Vector method are synchronized

 */

public class Cf04_list {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(0);
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        //list.pop(); // It will be pop 5
        // Here last means the first to come

        for (Integer inte : list ) {
            System.out.println(inte);
        }

        System.out.println("\nI am searching for 4 : " + list.search(4)); // This starts from
                                                    // Last
        System.out.println(list.indexOf(4)); // This traverse like array
        System.out.println(list.get(4));
        System.out.println("This is pop op and this will eliminate : " + list.pop());
        System.out.println();
        list.sort(null);
        Collections.reverse(list);
        list.pop();

        Iterator<Integer> lit = list.iterator() ;
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
    }
}