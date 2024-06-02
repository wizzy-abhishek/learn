package learning_java.collection_framework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Cf08_i_queue {
    public static void main(String[] args)  {
        Deque<String> dq = new ArrayDeque<>();

        dq.offerLast("Abhishek");
        dq.offerLast("Gargi");
        dq.offerLast("Rohan");
        dq.offerLast("Raj");

        System.out.println(dq.pollFirst());

        Iterator<String> lis = dq.iterator();
        try {
            search(dq);
        }catch (Exception i){
            System.out.println(i);
        }
    }
    static void search(Queue q) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the name you want to search : ");
        String target = br.readLine();
        for (Object element : q){
            if(target.equals(element)){
                System.out.println("Found");
            }
        }
    }
}
