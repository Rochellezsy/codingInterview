import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class P1116 {
    private int n;
    private Semaphore z=new Semaphore(1);
    private Semaphore e=new Semaphore(0);
    private Semaphore o=new Semaphore(0);

    public P1116(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for(int i=1;i<=n;i++){
            z.acquire();
            printNumber.accept(0);
            if(i%2==0){
                e.release();
            }else {
                o.release();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for(int i=2;i<=n;i=i+2){
            e.acquire();
            printNumber.accept(i);
            z.release();
        }

    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for(int i=1;i<=n;i=i+2){
            o.acquire();
            printNumber.accept(i);
            z.release();
        }

    }

    public static void main(String[] args) {
        P1116 test=new P1116(3);

    }
}
