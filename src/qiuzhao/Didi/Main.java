package qiuzhao.Didi;

import java.util.Scanner;

public class Main {

    static int min = Integer.MAX_VALUE;
    static int[][] edge = new int[100][100];
    static int[] vertex = new int[1000];
    static int n, m;
    static Scanner input = new Scanner(System.in);

    public static void dfs(int cur, int dis) {
        /**
         * 如果当前路径大于之前找到的最小值，可直接返回
         * */
        if (dis > min) {
            return;
        }
        /**
         * 判断是否达到最后一个结点，更新最小值，返回
         * */
        if(cur == n) {
            if (dis < min) {
                min = dis;
                return;
            }
        }
        /**
         * 当前点到其他各点之间可连通但是还未添加进来时，遍历执行
         * */
        for (int i = 1; i <= n; i++) {
            if (edge[cur][i] != Integer.MAX_VALUE && vertex[i] == 0) {
                vertex[i] = 1;
                dfs(i, dis+edge[cur][i]);
                /**
                 * 回溯
                 **/
                vertex[i] = 0;
            }
        }
        return;
    }

//    public static void main(String[] args) {
//        n = input.nextInt();
//        m = input.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (i == j) {
//                    edge[i][j] = 0;
//                } else {
//                    edge[i][j] = Integer.MAX_VALUE;
//                }
//            }
//        }
//        for (int i = 1; i <= m; i++) {
//            int a = input.nextInt();
//            int b = input.nextInt();
//            int c = input.nextInt();
//            edge[a][b] = c;
//        }
//
//        vertex[1] = 1;
//        dfs(1, 0);
//        System.out.println(min);
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int t=0; t<T; t++){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (i == j) {
                        edge[i][j] = 0;
                    } else {
                        edge[i][j] = Integer.MAX_VALUE;
                    }
                }
            }
            for (int i = 1; i <= m; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                edge[a][b] = c;
            }

            vertex[1] = 1;
            dfs(1, 0);
            System.out.println(min);

        }
    }

}
