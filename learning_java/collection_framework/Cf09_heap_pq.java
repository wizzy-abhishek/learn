package learning_java.collection_framework;

import java.util.Comparator;
import java.util.PriorityQueue;

class Mycom implements Comparator<Integer>{
    // To create MAX HEAP I override the comparing method
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 < o2) return 1 ;
        if(o1 > o2) return -1 ;
        return 0 ;
    }
}

public class Cf09_heap_pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Mycom());
        /*
        Priority queue is implemented using Array data structure.
        Priority depends on value
        small have high value WHEREAS large value have low value
         Always the high priority element gets deleted
         It is implemented like BINARY SEARCH
         In that the highest priority AKA small value element is the root node and it deleted always

         It follows HEAP concept (log(n) the time for insertion)

         */
        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);

        System.out.println(pq.peek() + "\n");

        pq.forEach(System.out::println);

        pq.poll();
        pq.forEach(System.out::println);

    }
}
