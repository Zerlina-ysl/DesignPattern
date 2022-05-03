package com.Thread.ProducerAndConsumer;


/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/5/3
 */
public class test {
    public static void main(String[] args) {
        Buffer box = new Buffer();
        for(int i=0;i<8;i++){
            new Producer(box).start();
        }
        for(int i=0;i<4;i++){
            System.out.println(1);
            new Consumer(box).start();
        }
    }
}
