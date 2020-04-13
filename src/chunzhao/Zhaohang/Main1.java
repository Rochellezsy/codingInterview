package chunzhao.Zhaohang;

import java.util.Scanner;

public class Main1 {

    public int spend(int[]len, int[]weight){
        int n=len.length;
        int[][]con=new int[n][2];
        for(int i=0;i<n;i++){
            con[i][0]=len[i];
            con[i][1]=weight[i];
        }

        consort(con);
        int ans=0;
        for(int i=1;i<n;i++){
            if(con[i][0]==con[i-1][0]){
                if(con[i][1]<con[i-1][1]){
                    ans++;
                }
            }
            else if(con[i][1]<con[i-1][1]){
                ans++;
            }
        }
        return ans+1;

    }

    public void consort(int[][]con){
        for(int i=0;i<con.length;i++){
            for(int j=i+1;j<con.length;j++){
                if(con[i][0]>con[j][0]){
                    swap(con,i,j);
                }
//                else if(con[i][0]==con[j][0]){
//                    if(con[i][1]>con[j][1]){
//                        swap(con,i,j);
//                    }
//                }
            }
        }
    }

    public void swap(int[][]con,int i,int j){
        int temp1=con[i][0];
        int temp2=con[i][1];
        con[i][0]=con[j][0];
        con[i][1]=con[j][1];
        con[j][0]=temp1;
        con[j][1]=temp2;
    }


    public static void main(String[] args) {
        Main1 t1=new Main1();
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        int[]res=new int[T];
        int index=0;
        while(T>0){
            int n=scanner.nextInt();
            int []len=new int[n];
            int []weight=new int[n];
            for(int i=0;i<n;i++){
                len[i]=scanner.nextInt();
            }
            for(int j=0;j<n;j++){
                weight[j]=scanner.nextInt();
            }
            res[index]=t1.spend(len,weight);
            T--;
            index++;
        }
        for(int r:res){
            System.out.println(r);
        }

    }
}
