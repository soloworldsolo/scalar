package soloworld.scalar.lld.multithreading;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    private Number number ;
    private Lock lock;
    @Override
    public void run() {
        for(int i=0;i<10000;i++) {
            lock.lock();
            number.setNumber(number.getNumber()+1);
            lock.unlock();
        }
    }


    public Adder(Number number, Lock lock) {
        this.number = number;
        this.lock = lock;
    }
}
