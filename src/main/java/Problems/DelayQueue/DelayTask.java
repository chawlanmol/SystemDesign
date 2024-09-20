package Problems.DelayQueue;

import lombok.Data;

import java.util.Objects;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

@Data
public class DelayTask implements Delayed {

    private String taskName;

    private long startTime;

    public DelayTask(String taskName, long delay, TimeUnit unit) {
        this.startTime = System.currentTimeMillis() + TimeUnit.MILLISECONDS.convert(delay, unit);
        this.taskName = taskName;
    }
    @Override
    public long getDelay(TimeUnit unit) {
        long delay = startTime - System.currentTimeMillis();
        return unit.convert(delay, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.startTime, ((DelayTask) o).startTime);

    }

    public void run() {
        System.out.println("task is running");
    }

}
