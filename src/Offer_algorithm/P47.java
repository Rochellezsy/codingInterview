package Offer_algorithm;

public class P47 {
    int ans=Integer.MIN_VALUE;
    public int maxValue(int[][] grid) {
        if(grid.length==0||grid[0].length==0)return 0;
        search(grid,0,0,0);
        return ans;
    }

    public void search(int[][] grid,int i, int j,int sum){
        if(i==grid.length-1 && j==grid[0].length-1){
            if(sum+grid[i][j]>ans){
                ans=sum+grid[i][j];
            }
            return;
        }
        if(i>=grid.length||j>=grid[0].length||i<0||j<0){
            return;
        }
        else{
            search(grid,i+1,j,sum+grid[i][j]);
            search(grid,i,j+1,sum+grid[i][j]);
        }
    }

    public static void main(String[] args) {
        int[][]grid={{1,2,3},{4,5,6}};
        P47 test=new P47();
        System.out.println(test.maxValue(grid));
    }
}
