import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    private List<String> melodies;

    public test(List<String> melodies) {
        melodies.sort(String::compareTo);

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
                }

public static void main(String[] args) {
        List<String>melodies=new ArrayList<>();
        melodies.add("aaa");
        melodies.add("zzz");
        melodies.add("bcd");
        melodies.add("bcdef");


        test mainSolver = new test(melodies);
        System.out.println(mainSolver.dynamicSolver());
    }
}
