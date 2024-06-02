package learning_java.generics;

interface A {}
class B implements A {}
class C extends B {}

class Gens<T extends C> {
    @SuppressWarnings("unchecked")
    T[] arr0 = (T[]) new Object[10];

    // We cant create an array of any generic type, so we have to create Array of generics and then
    // typecast it as generics type .

    int length = 0 ;

    public void append(T v){
        arr0[length++] = v ;
    }

    public void display(){
        for(int i = 0 ; i < length ; i++){
            System.out.println(arr0[i]);
        }
    }

}

public class Generics9 {

    static void fun(Gens<? super C> obj/* If i super any class which isn't available as parent it will cause error*/){
        obj.display();
    }

    @SuppressWarnings("Unchecked")
    public static void main(String[] args) {

        Gens<C> ref = new Gens<>(); // It can only A , B or C
        // ref.append(/* 10 */ );
        ref.display();
        //runtime exception

        Gens<C> genc = new Gens<>();

        fun(genc);
    }
}
