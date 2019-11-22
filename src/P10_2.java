public class P10_2 {
    public int JumpFloorII(int target) {
        if(target==0){
            return 0;
        }
        else if(target==1){
            return 1;
        }
        else if(target>1){
            int count=1;
            for(int i=1;i<target;i++){
                count=count*2;
            }
            return count;
        }
        return 1;


    }


}
