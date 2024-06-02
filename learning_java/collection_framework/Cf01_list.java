package learning_java.collection_framework;

import java.util.*;
/*

Array list is very fast while reading any data or iterating over the data
It is easy to access any element from any location

cons : Operations are slow
       Tends to use more memory while operating.

 */
public class Cf01_list {
    public static void main(String[] args) {
        ArrayList<String> list0 = new ArrayList<>();
        list0.add("Mummy");
        list0.add("Papa");
        list0.add("Bhai");

        ArrayList<String> list = new ArrayList<>();
        list.add("Abhishek");
        list.add("Aman");
        list.add(1, "Gargi");
        list.remove("Aman");
        list.addAll(list0);
        //list.retainAll(list0);
        @SuppressWarnings("unchecked")
        ArrayList<String> list2 = (ArrayList<String>) list.clone();
        list.add("Tuffy");
        //System.out.println(list.isEmpty());

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        for (int i = 0; i < list2.size() ; i++) {
            System.out.println(list2.get(i));
        }
        System.out.println(list.containsAll(list2));
        System.out.println(list.iterator());
        System.out.println();

        Object[] arr;
        arr = list.toArray();


        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> al = new ArrayList<>(List.of(10,20,30,40,50));
        al.add(60);

        for (Integer i : al){
            System.out.print(i +  " ");
        }

        System.out.println();

        Iterator<Integer> it = al.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        ListIterator<Integer> lit = al.listIterator();

        System.out.println(lit.hasPrevious());

        al.forEach(n -> System.out.println(n));
        System.out.println();

        al.forEach(System.out::println);
        System.out.println();

        al.forEach(Cf01_list::show);
    }
    static void show(int n ){
        if (n > 40){
            System.out.println(n);
        }
    }
}
