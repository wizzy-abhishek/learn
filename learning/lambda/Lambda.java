package learning.lambda;

import learning.lambda.*;

/*

 One way to access the method is creating another class and implementing the interface
 then creating the obj of that class and

 */

/*

class Lamb implements MyLambda{

    @Override
    public void display() {
        System.out.println("I am learning Lambda Expression ");
    }

}*/

import learning.lambda.*;

class Accessing {
    public void method(){
        LambdaAdd obj1 = (x,y)-> x+y ;
    }

}

public class Lambda {
    public static void main(String[] args) {
       // MyLambda obj = new Lamb();
       // obj.display();
        /*
        MyLambda obj = new MyLambda() {
            @Override
            public void display() {
                System.out.println("I am learning Lambda Exp ");
            }
        };
        obj.display();
        */
        MyLambda obj = ()-> {
            System.out.println("I am learning lambda expression ");
        };
        obj.display();

        // There is a shorter way
        MyParaLambda obj2 = System.out::println;
        obj2.show("I am Abhishek Anand");

        /*LambdaAdd obj3 = (x , y)-> {
            return x + y ;
        };*/
        LambdaAdd obj3 = (x, y)-> x+ y ;
        System.out.println(obj3.add(6, 84));
    }
}
