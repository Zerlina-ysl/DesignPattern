package Thread.ProducerAndConsumer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/5/4
 */
public class Buffer {
    Deque<Integer> queue = new LinkedList<Integer>();
    public static final int SIZE = 10;

    public void put(int i){
        synchronized (this){


                try {
                    while(queue.size()>=SIZE) {
                        System.out.println("队列满，请等待.");

                        wait();
                    }
                    queue.add(i);
                    notifyAll();
                    System.out.println("当前容量:"+queue.size());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


        }
    }


    public void take(){
        synchronized (this){


            try {
                while(queue.size()<=0) {
                    System.out.println("队列为空，请等待.");

                    wait();
                }
                queue.removeLast();
                notifyAll();
                System.out.println("当前容量:"+queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }




}
