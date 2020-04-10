package chunzhao.huawei;

public class Main3 {

    public void solve(int[][]origin){
        boolean[][]hang=new boolean[9][10];
        boolean[][]lie=new boolean[9][10];
        boolean[][][]gezi=new boolean[3][3][10];
        for(int i=0;i<origin.length;i++){
            for(int j=0;j<origin[0].length;j++){
                if(origin[i][j]>=1 && origin[i][j]<=9){
                    hang[i][origin[i][j]]=true;
                    lie[j][origin[i][j]]=true;
                    gezi[i/3][j/3][origin[i][j]]=true;
                }
            }
        }
        digui(origin,hang,lie,gezi,0,0);
    }

    public boolean digui(int[][]origin, boolean[][] hang, boolean[][] lie, boolean[][][] gezi, int i, int j){
        if(j==origin[0].length){
            j=0;
            i++;
            if(i==origin.length){
                return true;
            }
        }
        if(origin[i][j]==0){
            for(int num=1; num<=9; num++){
                boolean flag=!(hang[i][num] || lie[j][num] || gezi[i/3][j/3][num]);
                if(flag){
                    hang[i][num]=true;
                    lie[j][num]=true;
                    gezi[i/3][j/3][num]=true;
                    origin[i][j]=num;
                    if(digui(origin,hang,lie,gezi,i,j+1)){
                        return true;
                    }
                    origin[i][j]=0;
                    hang[i][num]=false;
                    lie[j][num]=false;
                    gezi[i/3][j/3][num]=false;

                }
            }
        }
        else {
            return digui(origin,hang,lie,gezi,i,j+1);
        }
        return false;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[]temp=new String[9];
//        char[][]origin=new char[9][9];
//        for(int i=0;i<9;i++){
//            temp[i]=scanner.next();
//            temp[i]=temp[i].substring(1,temp[i].length()-1);
//            for(int j=0;j<9;j++){
//                origin[i][j]=temp[i].charAt(j*2);
//            }
//        }

        int[][]origin={
                {5,0,0,6,0,2,0,0,0},
                {0,0,8,0,7,0,2,0,0},
                {7,0,0,8,1,0,5,4,6},
                {2,0,1,3,0,0,9,8,5},
                {3,4,0,0,8,0,0,0,0},
                {0,0,9,0,0,7,0,1,4},
                {1,5,6,0,2,0,0,0,3},
                {4,0,2,0,9,6,0,0,7},
                {9,0,0,0,0,3,0,0,1},
        };


        new Main3().solve(origin);
//        System.out.println(origin[0][0]);

        for(int i=0;i<9;i++){
            System.out.print("{");
            for(int j=0;j<9;j++){
                System.out.print(origin[i][j]);
                if(j!=8){
                    System.out.print(",");
                }
            }
            System.out.print("}");
            if(i!=8){
                System.out.println();
            }
        }

    }
}
