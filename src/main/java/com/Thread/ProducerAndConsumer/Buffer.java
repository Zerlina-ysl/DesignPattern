package com.Thread.ProducerAndConsumer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/5/3
 */
public class Buffer {
     Deque<Integer> queue = new LinkedList<Integer>();
    int size=50;
//    private final Object flag = new Object();

    public void put(int product) {
        //修饰的实例方法取代码所在的对象实例作为线程持有的锁
//        System.out.println(this);
        synchronized (this) {
            while (queue.size() >= size) {
                try {

                    System.out.println("队列满，等待..");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            queue.add(product);
            System.out.println("放入商品，现有商品：" + queue.size());
            notifyAll();
        }
    }
    public void take(){
        synchronized (this){
//            System.out.println(this);
            while (queue.size() <= 0) {
                try {

                    System.out.println("队列为空，等待");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            queue.removeFirst();
            System.out.println("商品取出，现有商品:" + queue.size());
            notifyAll();
        }
    }






}
