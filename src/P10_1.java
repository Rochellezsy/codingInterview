/*
n级台阶就相当于n-1级再跳一次一阶的和n-2级再跳一次2阶的
 */

public class P10_1 {
    public int JumpFloor(int target) {
        if(target==1){
            return 1;
        }
        else if(target==2){
            return 2;
        }
        else if(target>2){
            int sum=2;
            int one=1;
            for(int i=3;i<=target;i++){
                sum=sum+one;
                one=sum-one;
            }
            return sum;


        }
        return 1;

    }
}
