package CoreJava.Threading;


/**
 * Monitor lock aka synchronized , take lock on the whole object,
 *
 * rather than only critical section of the object, lock is aquired when, code go in syncronised block
 *
 *
 */

public class MonitorLockExample {

    public synchronized void task1() {
        try {
            Thread.sleep(1000);
            System.out.println("this is task 1 " + Thread.currentThread().getName());
        } catch (Exception e) {

        }
    }

    public  void task2() {
        System.out.println("this is task 2 Before synchronised" + Thread.currentThread().getName());

        synchronized (this) {
            System.out.println("this is task 2 after synchronised" + Thread.currentThread().getName());

        }
    }

}
