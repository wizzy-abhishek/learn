package learning_java.generics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class MyGen<Gen>
{

    @SuppressWarnings("unchecked")
    Gen[] array0 = (Gen[]) new Object[GenericsPractice.length] ;

    int length = 0 ;

    public void append(Gen g){
        array0[length++] = g ;
    }

    public void display(){
        for (int i = 0; i < length ; i++) {
            System.out.print(array0[i] + " ");
        }
    }
}
public class GenericsPractice {
        static int length  ;
     public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

         System.out.print("How many elements you want to add : ");
         length = Integer.parseInt(br.readLine());

         MyGen<Float> array = new MyGen<>();

        System.out.println("Enter the number : ");
        float element;
        for (int i = 0; i < length; i++) {
            element =Float.parseFloat(br.readLine());
            array.append(element);
        }

        array.display();

        br.close();
        isr.close();
    }
}
