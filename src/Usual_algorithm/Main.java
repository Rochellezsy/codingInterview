package Usual_algorithm;

import java.util.concurrent.Semaphore;

public class Main {
    static Semaphore A = new Semaphore(1);
    static Semaphore B = new Semaphore(0);
    Semaphore C = new Semaphore(0);

    static class ThreadA extends Thread {
        @Override
        public void run(){
            try {
                for(int i=0; i<10; i++){
                    A.acquire();
                    System.out.print("A");
                    B.release();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    static class ThreadB extends Thread {
        @Override
        public void run(){
            try {
                for(int i=0; i<10; i++){
                    B.acquire();
                    System.out.print("C");
                    A.release();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadB().start();
    }


}
