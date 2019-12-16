public class T14 {
    public int cutRope(int target) {
        int[] num=new int[target+1];
        int res=0;
        if(target==0){
            num[0]=1;
        }
        if(target==1){
            num[1]=1;
        }
        if(target==2){
            num[2]=2;
        }
        if(target==3){
            num[3]=2;
        }
        for(int i=4;i<=target;i++){
            for(int j=1;j<=target/2;j++){
                res=Math.max(res,num[j]*num[i-j]);
            }
            num[i]=res;
        }
        return num[target];

    }
}
