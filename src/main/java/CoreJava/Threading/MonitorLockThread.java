package CoreJava.Threading;

public class MonitorLockThread implements Runnable {

    MonitorLockExample obj;

    public MonitorLockThread(MonitorLockExample obj) {
        this.obj = obj;
    }


    @Override
    public void run(){
        obj.task1();
    }
}
