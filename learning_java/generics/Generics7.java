package learning_java.generics;

class MyGen2 extends MyGen<String>{

}  // if I won't declare any data type to parent class it will
    // consider as gen of object type , but to make MyGen2 accept any datatype at its own
    // then class MyGen2<Gen> extends MyGen<Gen>
    // then in main method MyGen@<Xyz> ref = new MyGen<>();

public class Generics7 {
    public static void main(String[] args) {
        MyGen2 ref =  new MyGen2();
        ref.append("Abhishek");
        ref.display();
    }
}
