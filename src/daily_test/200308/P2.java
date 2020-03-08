import java.util.Arrays;

public class P2 {
    public int numTimesAllBlue(int[] light) {
        int count=0;
        int max=light[0];
        for(int i=0;i<light.length;i++){
            if(light[i]>max){
                max=light[i];
            }
            if(max==i+1){
                count++;
            }
        }
        return count;

    }
}
