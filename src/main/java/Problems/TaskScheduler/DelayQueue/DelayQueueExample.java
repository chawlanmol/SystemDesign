package Problems.TaskScheduler.DelayQueue;

// every task in the delay queue must implement DELAY interface

import java.util.Date;
import java.util.concurrent.DelayQueue;

/**
 * Learning
 * 1. Delay queue only takes task which implement delay type
 * 2. Delay Task need to implement compare to Method.
 * 3. So it can Compare between two task
 * 4. it also initialze a startTime
 * 5. time at which task must be executed
 * 6. Its also need to execute a delayMethod
 * 7. which can check the difference b/w task start time and currentTime.
 */

public class DelayQueueExample {


    public void Demo() throws InterruptedException {
        DelayQueue<DelayTask> delayQ = new DelayQueue<>();
        DelayTask task1 = new DelayTask("task1" , 10000);
        DelayTask task2 = new DelayTask("task2" , 5000);

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

/**
 * Learning
 * 1. Delay queue only takes task which implement delay type
 * 2. Delay Task need to implement compare to Method.
 * 3. So it can Compare between two task
 * 4. it also initialze a startTime
 * 5. time at which task must be executed
 * 6. Its also need to execute a delayMethod
 * 7. which can check the difference b/w task start time and currentTime.
 */
