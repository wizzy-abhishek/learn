package learning;

public class Lambda4 {
    public static void reverse(String str){
        StringBuffer revSt = new StringBuffer(str);
        System.out.println(revSt.reverse());
    }

    public static void interfaceOperation(){
        MyParaLambda obj = Lambda4::reverse ;
        obj.show("Abhishek");
    }

    public static void learningMethodReference(){
        MyLambda obj2 = System.out::println;
        obj2.display();
        // In method reference to archive this method show take an argument
    }

    public static void interfaceOperation2(){
        MyParaLambda obj = System.out::println;
        obj.show("Abhishek");
    }

    public static void main(String[] args) {
        interfaceOperation();
        interfaceOperation2();

    }
}
