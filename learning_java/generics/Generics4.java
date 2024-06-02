package learning_java.generics;

class Data<T>{
    private  T obj ;


    public void setData(T obj){
        this.obj = obj ;
    }

    public T getData(){
        return obj ;
    }

}


public class Generics4 {
    public static void main(String[] args) {

        Data<Integer> i = new Data<>();
        i.setData(10);

        System.out.println(i.getData());
    }
}
