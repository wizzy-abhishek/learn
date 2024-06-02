package learning_java.generics;

class MyArray123<T>{
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

public class Generics11 {
    static void fun(MyArray123<? /* ? is called wildcard */ extends String> obj){

        //obj.append("Abhi"); //This will only accept null until wildcard is for object class
        obj.display();
    }
    // By using extends keyword in wildcard we make it upper bound
    // and by using super keyword we make it lower bound (Check it in Generics9)

    public static void main(String[] args) {
        MyArray123<String> ma1 = new MyArray123<>();
        ma1.append("Abhishek");
       // MyArray123<Float> ma2 = new MyArray123<>();
       // ma2.append(556200.566f);

       // fun(ma2);
        fun(ma1);
    }
}
