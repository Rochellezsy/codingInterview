import java.util.concurrent.Semaphore;

public class P1115 {
    private int n;
    private Semaphore fo=new Semaphore(1);
    private Semaphore ba=new Semaphore(1);


    public P1115(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            fo.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            ba.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            ba.acquire();

            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            fo.release();
        }
    }
}
