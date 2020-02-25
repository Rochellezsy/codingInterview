package Usual_algorithm;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Pool {

    private int cnt=0;
    private int max;

    Pool(int max){
        this.max=max;
    }

    //生产者
    public synchronized void produce() throws InterruptedException {
        if(cnt>=max){
            wait();
        }
        cnt++;
        System.out.println("生产者生产。。。产量"+cnt);
        notify();
    }

    //消费者
    public synchronized void consume() throws InterruptedException {
        if(cnt<=0){
            wait();
        }
        cnt--;
        System.out.println("消费者消费。。。产量"+cnt);
        notify();
    }

    public static void main(String[] args) {
        Pool pool=new Pool(6);
        Executor executor=Executors.newCachedThreadPool();

        for(int i=0;i<10;i++){
            executor.execute(()->{
                try {
                    pool.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        for(int i=0;i<10;i++){
            executor.execute(()->{
                try {
                    pool.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

    }

}
