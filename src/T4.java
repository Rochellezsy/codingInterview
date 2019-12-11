public class T4 {
    public boolean Find(int target, int [][] array) {
        int col=array.length-1;
        int row=array[0].length-1;
        int i=col;
        int j=0;
        while(i>=0 && j<=row){
            if(target>array[i][j]){
                j++;
            }
            else if(target<array[i][j]){
                i--;
            }
            else if(target==array[i][j]){
                return true;
            }

        }
        return false;
    }
}
