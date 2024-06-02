package learning_java;

import java.util.Random;
import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i = 6;
        Integer a = Integer.valueOf(i); /* Manual Boxing of primitive i */
        Integer b = i ;        /* Auto Boxing */

        Integer c = 84 ;
        int d = c.intValue(); /* Manual Unboxing of c */
        int e = c ;          /* Auto - Unboxing */
        int f = 84;

        Double g = Math.sqrt(2);
        Random j = new Random();
        final Integer h = j.nextInt(10,100);

        int any = in.nextInt();
        final Integer k = Integer.valueOf(any);

        System.out.println(i + " " + a + " " + b + " " + c + " " + d + " " + e);
        System.out.println(a.compareTo(c));
        System.out.println(a.getClass());
        System.out.println(a.equals(f));
        System.out.println(a.byteValue());
        System.out.println(a.doubleValue());
        System.out.println(c.describeConstable());
        System.out.println(g.isNaN());
        System.out.println(j);
        System.out.println(h);
        System.out.println(k);

    }
}
