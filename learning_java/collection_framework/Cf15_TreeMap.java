package learning_java.collection_framework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.*;

public class Cf15_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0,"Abhishek" , 1 ,"Gargi"));
        tm.put(2 ,"Mummy");
        tm.put(3,"Papa");
        tm.put(4, "Bhai");

        System.out.println(tm);
        Set<Map.Entry<Integer, String>> s = tm.entrySet();
        Entry<Integer, String> e = tm.firstEntry();
        System.out.println(s);
        System.out.println(e.getKey() + " " + e.getValue());
    }
}
