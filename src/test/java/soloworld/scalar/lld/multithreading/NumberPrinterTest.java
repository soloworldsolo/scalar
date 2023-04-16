package soloworld.scalar.lld.multithreading;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static org.junit.jupiter.api.Assertions.*;

class NumberPrinterTest {

    @Test
    void test1() {
        Executor executor = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 200; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executor.execute(numberPrinter);
        }

    }

    @Test
    void add_subraction_test() throws InterruptedException {
        Number number = new Number(0);
        Lock lock = new ReentrantLock();
         Thread t1 = new Thread(new Adder(number,lock));
         Thread t2 = new Thread(new Subractor(number,lock));
         t1.start();
         t2.start();
         t1.join();
         t2.join();

         assertEquals(0 , number.getNumber());


    }
}