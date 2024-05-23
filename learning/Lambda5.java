package learning;

class Lambda5demo{
    public void meth(){
        MyParaLambda mpl = System.out::append;
        mpl.show("Mai hu Abhishek ");
    }
}
public class Lambda5 {
    public static void main(String[] args) {
        Lambda5demo l = new Lambda5demo();
        l.meth();
        System.out.println();
        Lambda5demo2.key();
    }
}
 class Lambda5demo2 {
     public static void key() {
         MyParaLambda mpl1 = System.out::println;
         mpl1.show("Kya hua ???");
     }
 }