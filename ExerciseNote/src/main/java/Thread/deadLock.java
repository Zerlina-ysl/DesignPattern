package Thread;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/5/4
 */
public class deadLock implements Runnable{
    int flag = 0;


    static Object thread1 = new Object();
    static Object thread2 = new Object();


    @Override
    public void run() {
        if(flag==1){
        synchronized (thread1){

                try {
                    Thread.sleep(new Random().nextInt(1000));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("a在等待b");
                synchronized (thread2){

                    try {
                        System.out.println("a已经等到了b");
                        Thread.sleep(new Random().nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if(flag==2){
        synchronized (thread2){

                try {
                    Thread.sleep(new Random().nextInt(1000));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("b在等待a");
                synchronized (thread1){

                    try {
                        System.out.println("a已经等到了b");
                        Thread.sleep(new Random().nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        deadLock l1 = new deadLock();
        deadLock l2 = new deadLock();
        l1.flag=1;l2.flag=2;
        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(l2);
       t1.start();
        t2.start();
    }
}
