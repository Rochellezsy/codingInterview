public class tran {
    public static void main(String[] args) {
        String s="[[1,3,3,3],[2,2,1,2],[4,3,3,4],[3,2,2,3],[3,2,1,3],[4,1,4,3],[3,3,1,2]]";
        s=s.replace("[","{");
        s=s.replace("]","}");
        System.out.println(s);
    }
}
