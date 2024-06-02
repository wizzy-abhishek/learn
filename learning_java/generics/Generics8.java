package learning_java.generics;

class MyGen3<T extends Number> extends MyArray<T>{

}

public class Generics8 {
    public static void main(String[] args) {

        MyGen3<Double> ref = new MyGen3<>(); // it will only accept the class which is subclass of Number class
        ref.append(1556.5465);
        ref.append(156456.584);
        ref.display();
    }
}
