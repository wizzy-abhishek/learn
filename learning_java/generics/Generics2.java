package learning_java.generics;

public class Generics2 {
    /*
    We know that we can create an array of obj too

     */
    public static void main(String[] args) {
        Object[] arr = new Object[3];

        arr[0] = "Hii" ;
        arr[1] = "Hello" ;
        arr[2] = Integer.valueOf(10) ;

       /* for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }*/
        // It will run like this but if we have to typecast it then lets check
        String str ;
        for (int i = 0; i < 3 ; i++) {
            str = (String)arr[i];
            System.out.println(str);
        }
        // Now it will give a run time error of ClassCastException to make a generalized Array which
        // can warn it compile time only we made the concept of Generics.
    }
}
