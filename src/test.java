import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test {
    private List<String> melodies;

    public test(List<String> melodies) {
        Collections.sort(melodies);
        this.melodies = melodies;
        // 进行排序, 时间复杂度O(log(n))

    }

    public int dynamicSolver() {
        String[] mel = new String[melodies.size()];
        melodies.toArray(mel);
        int[] dp = new int[mel.length];
        for (int j = mel.length - 1; j >= 0; j--) {
            for (int i = j; i < mel.length; i++) {
                if (i == j) {
                    dp[j] = mel[j].length();
                } else if (mel[j].charAt(mel[j].length() - 1) <= mel[i].charAt(0)) {
                    dp[j] = Math.max(dp[j], mel[j].length() + dp[i]);
                }
            }
        }
        return dp[0];

//        int max=0;
//        for(int i=0;i<mel.length;i++){
//            dp[i]=mel[i].length();
//            for(int j=0;j<i;j++){
//                if(mel[j].charAt(mel[j].length()-1) <= mel[i].charAt(0)){
//                    int temp=dp[j]+mel[i].length();
//                    if(temp>dp[i]){
//                        dp[i]=temp;
//                    }
//                }
//            }
//            max=Math.max(max,dp[i]);
//        }
//        return max;
    }

    public static void main(String[] args) {
        List<String>melodies=new ArrayList<>();
        melodies.add("az");
        melodies.add("bzzz");
        melodies.add("cd");
        melodies.add("bcdef");


        test mainSolver = new test(melodies);
        System.out.println(mainSolver.dynamicSolver());
    }
}
