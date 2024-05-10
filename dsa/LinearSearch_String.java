package dsa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LinearSearch_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String input = in.nextLine();
        System.out.print("Enter the char you want to search in it : ");
        char target = in.next().charAt(0);
        System.out.println(isChar(input , target));
        System.out.println(searchchar(input , target));
    }
    public static int searchchar(String input , char target){
        char element ;
        for (int i = 0; i < input.length(); i++) {
            element = input.charAt(i);
            if(element == target){
                return i ;
            }
        }
        return Integer.MIN_VALUE;
    }
    public static boolean isChar(String input , char target){
        char element ;
        for (int i = 0; i < input.length(); i++) {
            element = input.charAt(i);
            if(element == target){
                return true ;
            }
        }
        return false;
    }
}
