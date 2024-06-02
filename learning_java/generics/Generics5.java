package learning_java.generics;

class MyArray<T>{
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

public class Generics5 {
    public static void main(String[] args) {
        MyArray<String> arr = new MyArray<>();

        arr.append("Hii");
        arr.append("Bye");

        arr.display();
    }
}
