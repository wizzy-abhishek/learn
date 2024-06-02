package learning_java.collection_framework;

import java.util.HashSet;
import java.util.Set;

public class Cf11_set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(10 );
        hs.add(10);
        hs.add(20);
        hs.add(15);
        hs.add(37);
        hs.add(38);
        hs.add(36);
        hs.add(35);
        hs.add(48);
        hs.add(5);
        hs.add(6);
        hs.add(12);
       for(Integer i : hs) {
           System.out.println(i);
       }

       HashSet<String> hss = new HashSet<>();
       hss.add("A");
       hss.add("B");
       hss.add("C");
       hss.add("D");
       hss.forEach(System.out::println);
    }
}
