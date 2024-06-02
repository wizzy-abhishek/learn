package learning_java.generics;

class Gen<T> {
    @SuppressWarnings("unchecked")
    //T[] data = (T[]) Array.newInstance(getClass().getComponentType(), 3);
    T[] data = (T[]) new Object[3];

    int length = 0;

    public void append(T g) {
        data[length++] =  g;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}

public class Generics3 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Gen /* <String> */ list = new Gen<>(); // By default, it will it take Object as parameter
        list.append(10);
        list.append("Abhishek");
        list.display();
    }
}
