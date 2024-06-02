package learning_java.collection_framework;

import java.util.LinkedList;

public class Cf02_list {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(6);
        list.add(84);
        list.add(10);
        list.add(50);
        list.set(3,4);



        for (int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i) + " ");
        }

        //for (Integer integer : list2) {
            System.out.print(list.subList(0,2));
       // }

    }
}
