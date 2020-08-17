import java.util.Scanner;

public class Dajiang {

    public int maxvalue(int N, int[]A, int[]B, int X){
        int[]dp =new int[X+1];
        for(int i=0; i<N; i++){
            for(int j=X; j>=0; j--){
                if(j>=B[i]){
                    dp[j] = Math.max(dp[j], dp[j-B[i]]+A[i]);
                }
            }
        }
        return dp[X];
    }

    public static void main(String[] args) {
        Dajiang test = new Dajiang();
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[]A = new int[N];
        int[]B = new int[N];
        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
        }
        System.out.println(test.maxvalue(N, A, B, X));
    }
}
