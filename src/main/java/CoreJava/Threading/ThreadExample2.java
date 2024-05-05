package CoreJava.Threading;

public class ThreadExample2 extends Thread {
    @Override
    public void run() {
        System.out.println("this is new ThreadExample2 " + Thread.currentThread().getName());
    }

}
