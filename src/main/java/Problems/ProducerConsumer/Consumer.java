package Problems.ProducerConsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Integer> buffer;

    public Consumer(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Consuming a value from the buffer
                int value = buffer.take(); // Removes and returns the head of the buffer
                System.out.println("Consumed: " + value);

                // Sleep to simulate time taken to consume
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}