package Problems.ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerDemo {

    public void Demo() throws InterruptedException {

        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(5);

        Integer capacity = 5;

        Thread pThread = new Thread(new Producer(buffer));

        Thread cThread = new Thread(new Consumer((BlockingQueue<Integer>) buffer));

        cThread.start();

        pThread.start();

    }
}
