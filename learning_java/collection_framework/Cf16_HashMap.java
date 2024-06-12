package learning_java.collection_framework;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class Cf16_HashMap {
    public static void main(String[] args) {
        HashMap<Integer , String> hm = new HashMap<>(Map.of(0 , "Abhishek" , 2 , "Gargi"));
        hm.put(1, "Mummy");
        hm.put(3 , "Papa");
        hm.put(4 , "Bhai");
        hm.put(0, "Abhi");
        hm.replace(0 , "Abhishek");

        System.out.println(hm);
        hm.forEach((number , name) ->System.out.println(number + " " + name));


    }
}
