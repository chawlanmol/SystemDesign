package CoreJava.Threading;

public class ThreadA implements Runnable {

    @Override
    public void run() {
        System.out.println("this is new thread" + Thread.currentThread().getName());
    }
}
