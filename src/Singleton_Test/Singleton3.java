package Singleton_Test;

public class Singleton3 {
    private Singleton3(){};
    private volatile static Singleton3 instance;
    private static Singleton3 getInstance(){
        if(instance==null){
            synchronized (Singleton3.class){
                if(instance==null){
                    instance=new Singleton3();
                }
            }
        }
        return instance;
    }


}
