package learning.lambda;

import learning.lambda.*;

class Doing {
    int count = 0 ;

    public void meth() {
        LambdaSOUT obj2 = () -> System.out.println("I am doing stuff");
        obj2.idk();
    }

    public void meth2(){
        count++ ;
        int num = 0;
        //num++;
        // Any local variable used in lambda expression should be final
        // or effective final which means no changes once it is used in a lambda expression
        // LambdaVar obj3 = () -> System.out.println(count+ num); Here num will give an error
        // if we have to use we increment the value of num and set it to another var
        // like int xyz = num++ ;
        // whereas these things not applicable to instance variable

        LambdaVar obj3 = () -> {
            int xyz = 100 ;
            int zyx = 50 ;
            xyz++;
            zyx--;
            System.out.println("Hiiiiii " + xyz);
            System.out.println(num + count);
            System.out.println("Byee " + zyx );
            xyz++ ;
            zyx-- ;
        };
        obj3.letsCheck();
        count++ ;
    }
}

class Something {

    LambdaSOUT obj = () -> System.out.println("Its nothing");
    MyLambda obj2 = () -> System.out.println("Its from another class");

    public void speak() {
        MyParaLambda obj123 = (a) -> System.out.println(a);
        obj123.show("Its inside a method of another class ");
    }
}

public class Lambda2 {
    public static void main(String[] args) {
        Doing d = new Doing();
        d.meth();
        d.meth2();
        Something s = new Something();
        // s.obj2;
        s.speak();

    }
}
