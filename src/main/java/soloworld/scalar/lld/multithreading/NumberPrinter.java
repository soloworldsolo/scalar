package soloworld.scalar.lld.multithreading;

public class NumberPrinter implements Runnable{

    private int noOfThreads;
    @Override
    public void run() {
        System.out.println("printing..." + noOfThreads + Thread.currentThread().getName());
    }

    public NumberPrinter(int noOfThreads) {
        this.noOfThreads = noOfThreads;
    }
}
