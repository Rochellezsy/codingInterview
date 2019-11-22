public class P4_2 {
    public boolean Find(int target, int [][] array) {
        int rows=array.length;


        if( rows==0 ){
            return false;
        }
        int cols=array[0].length;
        if( cols==0){
            return false;
        }


        int r=0;
        int c=cols-1;

        while(r<rows && c>=0){
            if(target>array[r][c]){
                r++;
            }
            if(target<array[r][c]){
                c--;
            }

            if(target==array[r][c]){
                return true;
            }

        }


        return false;
    }
}
