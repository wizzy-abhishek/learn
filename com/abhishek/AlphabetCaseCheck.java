package com.abhishek;
import java.util.Scanner;
public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        if(a >= 'A' && a <='Z'){
            System.out.println("Uppercase");
        }else{
            System.out.println("Lowercase");
        }
    }
}

