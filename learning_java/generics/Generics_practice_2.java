package learning_java.generics;

class PrimtGen <G>{
    public G obj ;
}

class Array_of_Gen <Arr> {
    @SuppressWarnings("unchecked")
    Arr[] arr = (Arr[]) new Object[5];

    int length = 0 ;

    public void push(Arr element){
        arr[length++] = element ;
    }

    public void display(){
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class Generics_practice_2 {

    public static <meth extends String> void add(meth obj){
        Array_of_Gen<String> obj2 = new Array_of_Gen<>();
        obj2.push(obj);
        obj2.display();
    }


    public static void main(String[] args) {

        PrimtGen<String> obj_of_G = new PrimtGen<>();
        obj_of_G.obj = "Abhishek" ;
        System.out.println(obj_of_G.obj);

        Array_of_Gen<String> call = new Array_of_Gen<>();
        add("Abhishek");
        call.push("Gugu");
        call.display();
    }
}
