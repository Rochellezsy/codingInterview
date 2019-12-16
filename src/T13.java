public class T13 {
    private int count=0;

    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] flag=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                return digui(i,j,rows,cols,flag,threshold);
            }
        }
        return 0;

    }

    public int digui(int i,int j,int rows,int cols,boolean[][] flag,int threshold){
        if(i<0 || j<0 ||i>=rows ||j>=cols ||flag[i][j]==true||check(i,j,threshold)==false){
            return 0;
        }
        flag[i][j]=true;
        return
                +digui(i+1,j,rows,cols,flag,threshold)
                +digui(i-1,j,rows,cols,flag,threshold)
                +digui(i,j+1,rows,cols,flag,threshold)
                +digui(i,j-1,rows,cols,flag,threshold)
                +1;



    }

    public boolean check(int i,int j,int threshold){
        int sumi=0;
        int sumj=0;
        while(i!=0){
            sumi=sumi+i%10;
            i=i/10;
        }
        while(j!=0){
            sumj=sumj+j%10;
            j=j/10;
        }
        if(sumi+sumj<=threshold){
            return true;
        }
        return false;
    }

}
