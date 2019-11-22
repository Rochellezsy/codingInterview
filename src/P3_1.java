public class P3_1 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null || length<=0){
            return false;
        }
        for(int i=0;i<length;i++){
            if (numbers[i] < 0 || numbers[i]>=length) {
                return false;
            }

        }

        for(int i=0;i<length;i++){
            while(numbers[i]!=i){
                if(numbers[numbers[i]]==numbers[i]){
                    duplication[0]=numbers[i];
                    return true;
                }

                swap(numbers[i],numbers[numbers[i]]);
/*              int temp=numbers[i];
                numbers[i]=numbers[numbers[i]];
                numbers[numbers[i]]=temp;
*/
            }

        }
    return false;

    }

    public void swap(int x,int y){
        int temp =x;
        x=y;
        y=temp;
    }


}
