package learning_java.generics;

class MyGen4<T> extends MyArray<T>{

}

public class Generics10 {
    static <T> void show(T[] list){
        for (T x : list){
            System.out.println(x);
        }
    }

    @SafeVarargs
    static <E> void show2(E... list){
        for (E x : list){
            System.out.print(x + " ");
        }
    }

    @SafeVarargs
    static <A extends String> void show3(A... list){
        for (A x : list){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        show(new String[]{"Hii" , "Hello " , "Bye"});
        show(new Integer[]{10 , 20 , 30});
        show2(10,50,"Abhishek");
        System.out.println();
        show3("Abhishek" , "Gargi");
    }
}
