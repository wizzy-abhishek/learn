package com.abhishek;

public class ArrayObj {
    String name ;
    long mobileNum ;
    public static void main(String[] args) {
        ArrayObj first = new ArrayObj();
        first.name = "Abhishek anand";
        first.mobileNum = 82357726 ;
        ArrayObj second = new ArrayObj();
        second.name = "Gargi Parmar aka Bubu Parsad Choursia" ;
        second.mobileNum = 8085991 ;
        ArrayObj[] arr = new ArrayObj[2];
        arr[0] = first ;
        arr[1] = second ;
        for(ArrayObj datatype : arr){
            System.out.println("Name : " + datatype.name +"\n" +" Mobile Num : " + datatype.mobileNum );
        }

    }
}
