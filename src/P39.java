import java.lang.reflect.Array;
import java.util.Arrays;

public class P39 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int res=array[0];
        int len=array.length;
        int count=1;

        Arrays.sort(array);
        if(array.length==1){
            return array[0];
        }

        for(int i=1;i<len;i++){
            if(array[i]==res){
                count++;
                if(count>len/2){
                    return res;
                }
            }
            else if(array[i]!=res){
                res=array[i];
                count=1;
            }
        }

        return 0;


    }

    public static void main(String[] args) {
        int []array={1,2,3,2,2,2,5,4,2};
        P39 test=new P39();
        System.out.print(test.MoreThanHalfNum_Solution(array));
    }
}
