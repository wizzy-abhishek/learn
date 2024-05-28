package learning.generics;

import java.sql.SQLOutput;

public class Generics1 {
    /*
     In older version we used to generalize upcasting and can make a reference to
     any class via
     Object obj = new String("Abc");
     System.out.println(obj);
     by using Object class we can access any class,
     and we have to typecast it to that particular type if
     we do opposite
       like String str = obj : This will give an error
       but String str = (String)obj ; This won't give any error.

     but this had some drawbacks like
     if we did
     obj = new Integer(10) ;
     now it is assigned to an integer class

     */
    public static void main(String[] args) {

        Object obj = new String("I am Abhishek");
        System.out.println(obj);

        String str = (String) obj;
        System.out.println(str);

        //But if

        Object obj2 = new String("Hello");
       // obj2 = 10
        // It's not giving error now, but it causes runtime error of ClassCastException
        System.out.println((String) obj2);
        // To overcome this and array object problem the concept of generics was introduced.

    }
}
