package learning_java.collection_framework;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Cf05_queue {
    public static void main(String[] args) {
        Queue<String> q = new Queue<String>() {
            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String remove() {
                return "";
            }

            @Override
            public String poll() {
                return "";
            }

            @Override
            public String element() {
                return "";
            }

            @Override
            public String peek() {
                return "";
            }


            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        q.add("Abhishek");
        q.add("Gargi");
        System.out.println(q.peek());
    }
}
