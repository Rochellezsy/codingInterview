package Concurrency_algorithm;

public class WaitTest {
    private static int count=0;
    private static int capacity=10;
    private static String obj="";

    class Producer implements Runnable{
        @Override
        public void run() {
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (obj){
                    for(int j=0;j<4;j++){
                        while(count==capacity){
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        count++;
                        System.out.println("生产者生产，仓库数量为"+count);
                    }
                    obj.notifyAll();
                }
            }
        }
    }

    class Consumer implements Runnable{
        @Override
        public void run() {
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    while(count==0){
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println("消费者消费，数量为"+count);
                    obj.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
        WaitTest waitTest=new WaitTest();
        Thread thread1=new Thread(waitTest.new Producer());
        Thread thread2=new Thread(waitTest.new Consumer());
        thread1.start();
        thread2.start();



    }
}
