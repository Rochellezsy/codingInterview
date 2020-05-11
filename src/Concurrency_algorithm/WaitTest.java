package Concurrency_algorithm;
public class WaitTest{
    private static int capacity=10;
    private static int count=0;
    private static String lock="lock";

    //生产者
    class Produce implements Runnable{
        @Override
        public void run(){
            for(int i=0;i<10;i++){
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                synchronized(lock){
                    while(count==capacity){
                        try{
                            lock.wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println("生产者生产，数量为："+count);
                    lock.notifyAll();
                }
            }

        }
    }

    class Consume implements Runnable{
        @Override
        public void run(){
            for(int i=0;i<10;i++){

                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                synchronized(lock){
                    while(count==0){
                        try{
                            lock.wait();
                        }
                        catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println("消费者消费，数量为："+count);
                    lock.notifyAll();
                }
            }

        }
    }

    public static void main(String[] args){
        WaitTest waitTest=new WaitTest();
        new Thread(waitTest.new Produce()).start();
        new Thread(waitTest.new Consume()).start();
        new Thread(waitTest.new Produce()).start();
        new Thread(waitTest.new Consume()).start();
        new Thread(waitTest.new Produce()).start();
        new Thread(waitTest.new Consume()).start();

    }
}
