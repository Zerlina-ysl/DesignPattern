package com.Thread;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/5/3
 */
public class deadLock extends Thread{


      static    Object thread1 =new Object();

          static Object thread2 = new Object();

         int flag =0;
        @Override
        public void run() {
            if(flag==1){
                synchronized (thread1){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
//                        System.out.println("异常1");
                    }
                    System.out.println("thread1在等thread2");
                    synchronized (thread2){
                        System.out.println("thread1等到了thread2");
                    }
                }
            }
            if(flag==2){
                synchronized (thread2){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
//                        System.out.println("异常2");
                    }
                    System.out.println("thread2在等thread1");
                    synchronized (thread1){
                        System.out.println("thread2等到了thread1");
                    }
                }
            }

        }

    public static void main(String[] args) {
        deadLock d1 = new deadLock();
        deadLock d2 = new deadLock();
        d1.flag=1;
        d2.flag=2;
        Thread t1 = new Thread(d1);
        Thread t2=new Thread(d2);
        t1.start();
        t2.start();
    }
}
