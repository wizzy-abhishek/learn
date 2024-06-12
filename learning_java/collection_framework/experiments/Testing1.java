package learning_java.collection_framework.experiments;

import java.util.*;

class NewDS<Key1 , Key2 , WrapperClass> extends HashSet implements Comparable{
    
    Key1[] arr = (Key1[]) new Object();
    Key2[] arr2 = (Key2[]) new Object();
    WrapperClass arr3 = (WrapperClass) new Object();

    @Override
    public int compareTo(Object o) {
        
            if ((Key1)arr != (Key2) arr2)
                return -1 ;

        return 0;
    }

    public void add(Key2 i, Key2 i1, WrapperClass abhishek) {
    }
}

public class Testing1 {
    public static void main(String[] args) {
        NewDS<Integer , Integer , String > nds = new NewDS<>();
        nds.add(1 , 911 , "Abhishek");
    }
}
