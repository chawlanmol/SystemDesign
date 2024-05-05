package CoreJava.Threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LearningLock {

    ReentrantReadWriteLock lock =  new ReentrantReadWriteLock();
    public void testLock(){

        lock.readLock().lock();
        lock.writeLock();

        notify();

        notifyAll();

        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        lock.readLock().unlock();


    }
}
