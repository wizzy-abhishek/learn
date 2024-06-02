package learning_java.collection_framework;

import java.util.HashSet;

public class Cf03_set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Abhishek");
        set.add("Abhishek");

        for (String s : set){
            System.out.println(s);
        }
        System.out.println(set.size());
    }
}
