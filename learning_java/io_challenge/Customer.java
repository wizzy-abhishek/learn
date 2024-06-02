package learning_java.io_challenge;

import java.io.Serializable;

public class Customer implements Serializable {
    String custId ;
    String name ;
    private String mob ;
    static int count = 0 ;

    public Customer(){

    }

    public Customer(String name , String mob){
        custId = "C" + count ;
        this.name = name ;
        this.mob = mob ;
        count++ ;
    }

    @Override
    public String toString() {
        return "Customer Details : "+ "\n" +
                "Consumer ID : " + custId + "\n" +
                "Consumer Name : " + name + "\n" +
                "Mobile num : " + mob ;
    }
}
