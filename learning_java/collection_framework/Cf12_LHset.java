package learning_java.collection_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Cf12_LHset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Set.of(10,20,15,37,38,36,35,48,5,6,12) );
        lhs.forEach(System.out::println);
        LinkedHashSet<String> hss = new LinkedHashSet<>();
        hss.add("A");
        hss.add("B");
        hss.add("C");
        hss.add("D");
        hss.forEach(System.out::println);
    }
}
