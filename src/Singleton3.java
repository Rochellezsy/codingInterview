public class Singleton3 {
    private Singleton3(){}

    public static class holder{
        private static Singleton3 instance=new Singleton3();
    }
    public static Singleton3 getInstance(){
        return holder.instance;
    }

}
