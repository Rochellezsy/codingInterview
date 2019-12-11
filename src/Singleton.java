//饿汉方式
public class Singleton {
    private Singleton(){
    }
    //在静态初始化时就创建实例
    private static Singleton instance=new Singleton();
    public static Singleton getInstance(){
        return instance;
    }

}
