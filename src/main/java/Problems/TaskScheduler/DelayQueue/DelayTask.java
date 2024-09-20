package Problems.TaskScheduler.DelayQueue;

import lombok.Data;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

@Data
public class DelayTask implements Delayed {

    private String taskName;

    private long startTime;

    public DelayTask(String taskName, long delay) {
        this.startTime = System.currentTimeMillis() + delay;
        this.taskName = taskName;
    }
    @Override
    public long getDelay(TimeUnit unit) {
        return startTime - System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.startTime, ((DelayTask) o).startTime);

    }

    public void run() {
        System.out.println("task is running");
    }

}
