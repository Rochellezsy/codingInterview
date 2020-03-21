package Map;

/**
 *无向图中连通分量的数目
 *
 */

public class P323 {
    int[]table;
    public int countComponents(int n, int[][] edges) {
        table=new int[n];
        for(int i=0;i<n;i++){
            table[i]=i;
        }

        for(int i=0;i<edges.length;i++){
            join(edges[i][0],edges[i][1]);
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(table[i]==i){
                count++;
            }
        }
        return count;
    }

    public void join(int i, int j){
        int boss1=boss(i);
        int boss2=boss(j);
        if(boss1!=boss2){
            table[boss1]=boss2;
        }

    }

    public int boss(int x){
        int ans=x;
        while(ans!=table[ans]){
            ans=table[ans];
        }
        return ans;
    }
}
