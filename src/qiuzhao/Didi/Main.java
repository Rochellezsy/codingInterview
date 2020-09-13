package qiuzhao.Didi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N = 1000;
    static int[][] maze;
    static int[] dis;
    static boolean[] vis;

    public static void init(){
        maze = new int[N][N];
        Arrays.fill(maze, Integer.MAX_VALUE);
        dis = new int [N];
        Arrays.fill(dis, Integer.MAX_VALUE);
        vis = new boolean[N];
    }

    public static void dijkstra(int st, int n, int m)
    {
        dis[st]=0;
        for(int i=1; i<=n; i++)
        {
            //找到和起点距离最短的点
            int minx=0;
            int minmark = 0;
            for(int j=1; j<=n; j++)
            {
                if(!vis[j] && dis[j]<=minx)
                {
                    minx=dis[j];
                    minmark=j;
                }
            }
            //并标记
            vis[minmark]=true;
            //更新所有和它连接的点的距离
            for(int j=1; j<=n; j++)
            {
                if(!vis[j] && dis[j]>dis[minmark]+maze[minmark][j])
                    dis[j]=dis[minmark]+maze[minmark][j];
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int t=0; t<T; t++){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            init();
            for(int i=1; i<=m; i++)
            {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int len = scanner.nextInt();
                maze[y][x]=len;
                maze[x][y]=len;
            }
            //以1为起点跑一次dij
            dijkstra(1, n, m);
            //输出到n的距离
            System.out.println(dis[n]);

        }
    }

}
