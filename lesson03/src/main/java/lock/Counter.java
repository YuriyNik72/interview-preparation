package lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private Lock lock =new ReentrantLock();
    private int max = 200;
    private int threadLimit = 4;
    private  int value;

    public void startIncrement(){
        List<Thread> threadList = new ArrayList<>();
        for (int i=0; i<threadLimit; i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0; i<max/ threadLimit; i++){
                       increment();
                    }
                }
            });
            threadList.add(thread);
        }
        for (Thread thread : threadList)
            thread.start();
        for(Thread thread : threadList){
            try {
                thread.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    private void increment(){
        lock.lock();
        value++;
        lock.unlock();
    }
    public int getValue(){
        return value;
    }

}
