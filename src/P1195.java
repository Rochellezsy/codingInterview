import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class P1195 {
    private int n;
    private Semaphore number=new Semaphore(1);
    private Semaphore fi=new Semaphore(0);
    private Semaphore bu=new Semaphore(0);
    private Semaphore fibu=new Semaphore(0);

    public P1195(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5!=0){
                fi.acquire();
                printFizz.run();
                number.release();
            }
        }

    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%3!=0){
                bu.acquire();
                printBuzz.run();
                number.release();
            }
        }

    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%3==0){
                fibu.acquire();
                printFizzBuzz.run();
                number.release();
            }
        }

    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for(int i=1;i<=n;i++){
            number.acquire();
            if(i%3==0 &&i%5==0){
                fibu.release();
            }
            else if(i%3==0){
                fi.release();
            }
            else if(i%5==0){
                bu.release();
            }
            else {
                printNumber.accept(i);
                number.release();
            }
        }

    }
}
