package soloworld.scalar.lld.multithreading;

import java.util.concurrent.locks.Lock;

public class Subractor implements Runnable{
    private Number num;
    private Lock lock;
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            lock.lock();
            num.setNumber(num.getNumber()-1);
            lock.unlock();
        }
    }

    public Subractor(Number num, Lock lock) {
        this.num = num;
        this.lock = lock;
    }
}
