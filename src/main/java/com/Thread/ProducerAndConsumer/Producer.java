package com.Thread.ProducerAndConsumer;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/5/3
 */
public class Producer extends Thread{
    Buffer q;

    public Producer(Buffer producer) {
        this.q = producer;
    }

    @Override
    public void run() {
        while (true){

            try {
                int i = new Random().nextInt(100);
                q.put(i);
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}