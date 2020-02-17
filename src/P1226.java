import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class P1226 {
    private ReentrantLock[] lockforklist={new ReentrantLock(), new ReentrantLock(),new ReentrantLock(),new ReentrantLock(),new ReentrantLock()};
    private Semaphore eatlimit=new Semaphore(4);

    public P1226() {

    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {

        int leftfork=philosopher;
        int rightfork=(philosopher+4)%5;

        eatlimit.acquire();
        lockforklist[leftfork].lock();
        lockforklist[rightfork].lock();

        pickLeftFork.run();
        pickRightFork.run();

        eat.run();

        putLeftFork.run();
        putRightFork.run();

        lockforklist[leftfork].unlock();
        lockforklist[rightfork].unlock();

        eatlimit.release();



    }
}
