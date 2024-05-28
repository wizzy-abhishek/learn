package learning.io_producer_consumer_piped;

import java.io.OutputStream;

public class Producer extends Thread{
    OutputStream os ;
    public Producer(OutputStream os){
        this.os = os ;
    }

    public void run(){
        int count = 1 ;
         while(true){
             try {
                 os.write(count);
                 os.flush();

                 System.out.println("Producer" + count);
                 System.out.flush();

                 Thread.sleep(10);

                 count++;
             }catch (Exception e){
                 System.out.println(e);
             }
         }
    }
}
