package com.Thread.ProducerAndConsumer;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/5/3
 */

public class Consumer extends Thread{
    Buffer q;

    public Consumer(Buffer consumer) {
        this.q = consumer;
    }

    @Override
    public void run() {
        while(true){
            try {

                q.take();
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}