public class P10_3 {
    public int RectCover(int target) {
        if(target==1){
            return 1;

        }
        else if(target==2){
            return 2;
        }
        else if(target>3){
            int sum=2;
            int one=1;
            for(int i=2;i<target;i++){
                sum=sum+one;
                one=sum-one;
            }
            return sum;
        }
        return 0;

    }

}
