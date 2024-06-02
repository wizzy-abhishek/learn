package learning_java.collection_framework;

import java.util.ListIterator;
import java.util.Vector;

public class Cf06_list {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();

        vec.add("abhishek");
        vec.add(0,"Gargi");

        vec.forEach(System.out::println);

        ListIterator<String> livec = vec.listIterator();

        System.out.println(livec.next());
        System.out.println(livec.next());
        System.out.println(vec.get(0));
        System.out.println(vec.indexOf("Gargi"));


    }
}
