import java.util.concurrent.atomic.AtomicInteger;

public class P1114 {

    private AtomicInteger firstjob=new AtomicInteger(0);
    private AtomicInteger secondjob=new AtomicInteger(0);
    public P1114() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstjob.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (firstjob.get()!=1){
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondjob.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (secondjob.get()!=1){
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
