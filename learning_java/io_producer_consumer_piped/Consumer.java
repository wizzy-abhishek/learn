package learning_java.io_producer_consumer_piped;

import java.io.InputStream;

public class Consumer extends Thread{
    InputStream is ;
    public Consumer(InputStream is){
        this.is = is ;
    }
    public void run() {
        int x ;

        while (true) {
            try {
                x = is.read();
                System.out.println("Consumer " + x );
                System.out.flush();

                Thread.sleep(10);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }



        }
    }
}
