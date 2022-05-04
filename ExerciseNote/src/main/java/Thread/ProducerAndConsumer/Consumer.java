package Thread.ProducerAndConsumer;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/5/4
 */
public class Consumer extends Thread{

    Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(true){

            try {

                buffer.take();
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
