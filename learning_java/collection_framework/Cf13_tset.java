package learning_java.collection_framework;

import java.util.*;

public class Cf13_tset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40));
        // TreeSet sorts the tree .

        System.out.println(ts.ceiling(55));
        System.out.println(ts);
        Spliterator<Integer> s  = ts.spliterator();
        s.forEachRemaining(System.out::println);
    }
}