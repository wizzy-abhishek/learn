package learning;

import java.util.Arrays;

public class LearningSwapFunc {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;
        swap(a , b); // it changes the copy of obj 10 and 20 that is passed
        // [ PRIMITIVE DATA TYPES JUST PASS BY VALUE ]
        // In case of primitives pass by value mech works
        // Hence a copy of data is passed so changes won't occur in real data 
        System.out.println(a + " " + b); //pass by value so the copy of obj is passes

        int[] arr = { 1};
        /*
        In case of array the memory location of that array (not the
        content) , so changes affect the array directly.
        Here we pass the reference of the array not the copy of the
        element in the array . Java really doesn't support pass by
        reference in few cases it can be archived like in wrapper class ,
        array , some mutable obj , also when we pass obj reference a copy
        of reference is passed, so it gives the address of original obj.
         */
        changearr(arr);
        System.out.println(arr[0]);
        {
            a = 84 ; // This is called shadowing [I changed the value of higher level scope inside a block]
            /*
            Here the values will change of a because we didn't declare the reference
            variable a.We are pointing the same a and updating it inside a block, so it will
            change the value of a
             */
            System.out.println(a);
            /*
            However if we declare a different a new reference variable inside a scope
            we can not use it outside this block
             */
        }
        System.out.println(a);
        variableargs(1,2,3,4,5,6,7,8,9,10,11);
    }

    static void changearr(int[] arrg) {
        arrg[0] = 88 ;
    }

    public static void swap(int a, int b){
        int temp = a ;
        a = b ;
        b = temp ;
        System.out.println(a + " " + b);
    }
     static void variableargs(int ...name){
        System.out.println(Arrays.toString(name));
    }
}
 /*
  State of an obj defines its looks and characteristics
  like for car color , model , year etc. are state where its
  methods (like what it does ) is its behaviour .
  I still have few doubt regarding an obj .
 */
