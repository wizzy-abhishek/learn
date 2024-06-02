package learning_java.collection_framework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cf_17_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer , String> lhm = new LinkedHashMap<>(5 , 0.75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry e) {
                return size()> 6;
            }
        };
        // It creates a table and for next and prev. element
        // It is used as cache because of the type of constructor I used if it was different type of constructor then maybe key value 0 will
        // go because it is entered first now 0 is gone because it is least recent used

        lhm.put(0,"Dadi");
        lhm.put(1, "Ajay");
        lhm.put(2, "Puja");
        lhm.put(3, "Abhishek");
        lhm.put(4, "Raj");
        lhm.put(5, "Tuffy");
        lhm.put(6, "Bubu");


        String s = lhm.get(1);
        s = lhm.get(2);
        s = lhm.get(3);
        s = lhm.get(4);
        s = lhm.get(5);
        s = lhm.get(6);
        s = lhm.get(1);
        s = lhm.get(2);
        s = lhm.get(3);
        s = lhm.get(4);
        s = lhm.get(5);
        s = lhm.get(6);
        s = lhm.get(1);
        s = lhm.get(2);

        lhm.forEach((number , name ) -> System.out.println(number + " " + name ));
    }
}
