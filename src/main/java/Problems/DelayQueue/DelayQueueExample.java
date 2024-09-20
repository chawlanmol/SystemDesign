package Problems.DelayQueue;

// every task in the delay queue must implement DELAY interface

import java.util.Date;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

/**
 * Every task in the delay queue must implement Delay interface
 *
 */
public class DelayQueueExample {


    public void Demo() throws InterruptedException {
        DelayQueue<DelayTask> delayQ = new DelayQueue<>();
        DelayTask task1 = new DelayTask("task1" , 10 , TimeUnit.SECONDS);
        DelayTask task2 = new DelayTask("task2" , 5 , TimeUnit.SECONDS);

        delayQ.put(task2);
        delayQ.put(task1);

        System.out.println("Executing: : "  + new Date(System.currentTimeMillis()));


        while (!delayQ.isEmpty()) {
            DelayTask task = delayQ.take();
            // take() blocks until a task is ready
            System.out.println("Executing: " + task.getTaskName() + " : " + new Date(System.currentTimeMillis()));
            task.run();
        }

    }
}
