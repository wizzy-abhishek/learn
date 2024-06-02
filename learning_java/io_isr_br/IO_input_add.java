package learning_java.io_isr_br;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_input_add {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String ab = br.readLine();
        String bc = br.readLine();
        int a = Integer.parseInt(ab);
        int b = Integer.parseInt(bc);
        int c = a +b;
        System.out.println(c);

    }
}
