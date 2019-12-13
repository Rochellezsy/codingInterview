public class T10_b1 {
    public int JumpFloor(int target) {
        if(target==0) return 0;
        if(target==1) return 1;
        if(target==2) return 2;
        if(target>2){
            int b=2;
            int a=1;
            for(int i=3;i<=target;i++){
                b=b+a;
                a=b-a;
            }
            return b;
        }
        return 0;
    }
}
