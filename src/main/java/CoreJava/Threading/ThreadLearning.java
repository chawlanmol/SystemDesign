package CoreJava.Threading;


import java.util.LinkedList;
import java.util.List;

/**
 * thread needs  object of runnable to initialize;
 * thread set priority does not guarantee priority
 *
 * default priority of thread is 5. NORM_PRIORITY
 *
 * User thread vs Daemon thread
 *
 *  thread.setDaemonThread(true) -> this will star working.
 *  Daemon thread is alive , till any one user thread is alive
 *  if all user threads are dead , Daemon thread is also dead.
 *
 *  Daemon is use ful for java garbage Collactor
 *
 */
public class ThreadLearning {


    public void demo(){
        creatingThreadByExtendingThreadClass();
    }

    public void creatingThreadByExtendingThreadClass() {

        ThreadExample2 threadFromThreadClass1 = new ThreadExample2();

        ThreadExample2 threadFromThreadClass3 = new ThreadExample2();

        threadFromThreadClass1.setPriority(10);

        threadFromThreadClass3.setDaemon(true);

        threadFromThreadClass1.start();

        threadFromThreadClass3.start();

    }

    public void LearningMonitorLock(){
        MonitorLockExample monitorLockExample = new MonitorLockExample();
        MonitorLockThread monitorLockThread = new MonitorLockThread(monitorLockExample);
        Thread thread = new Thread(monitorLockThread);
        thread.start();

        Thread thread1 = new Thread(() -> {monitorLockExample.task2();});
        thread1.start();

        List<Integer> integerList = new LinkedList<>();
        integerList.add(0);
        System.out.println(integerList.get(1));

    }
}
