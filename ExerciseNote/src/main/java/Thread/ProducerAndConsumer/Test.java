package Thread.ProducerAndConsumer;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/5/4
 */
public class Test {
    public static void main(String[] args) {


        Buffer buffer = new Buffer();
         for (int i = 0; i < 3; i++) {
            new Producer(buffer).start();
        }
        for (int i = 0; i < 3; i++) {
            new Consumer(buffer).start();
        }
    }

}
