package learning_java.collection_framework;

import java.util.ArrayDeque;

public class Cf07_queue {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();
        // Faster than stack and LinkedList
        // It is not thread safe

        ad.offerFirst("Abhishek");
        ad.offerFirst("Gargi");
        ad.offerFirst("Mummy");
        ad.offerFirst("Papa");
        ad.offerFirst("Bhai");
        ad.offerLast("Hello");
        ad.pollLast();

        ad.forEach(System.out::println);

    }
}
