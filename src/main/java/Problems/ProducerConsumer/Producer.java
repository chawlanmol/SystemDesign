package Problems.ProducerConsumer;

import java.util.concurrent.BlockingQueue;


// Producer class
public class Producer implements Runnable {
    private BlockingQueue<Integer> buffer;

    public Producer(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int value = 0;
        try {
            while (true) {
                // Producing a value
                System.out.println("Produced: " + value);
                buffer.put(value); // Inserts the produced item into the buffer
                value++;

                // Sleep to simulate time taken to produce
                Thread.sleep(100);
            }
        } catch (InterruptedException ignored) {

        }
    }
}