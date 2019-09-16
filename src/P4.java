public class P4 {
    public boolean Find(int target, int [][] array) {
        if(array==null || array.length<=0 ||array[0].length<=0){
            return false;
        }
        int rows=array.length;
        int cols=array[0].length;

        int r=0;
        int c=cols-1;

        while(r<=rows-1 && c>=0){
            if(target<array[r][c]){
                c--;
            }
            else if(target>array[r][c]){
                r++;
            }
            else if(target==array[r][c]){
                return true;
            }
        }
        return false;
    }


}


