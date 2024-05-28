package learning.io_producer_consumer_piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedProConsum {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos);

        Producer objP = new Producer(pos);
        Consumer objC = new Consumer(pis);

        objP.start();
        objC.start();
    }
}
