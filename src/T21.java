public class T21 {
    public void reOrderArray(int [] array) {
        int i=0;
        int j;
        while(true){
            while(i<array.length && array[i]%2!=0){
                i++;
            }
            j=i+1;
            while(j<array.length && array[j]%2==0){
                j++;
            }
            if(j<array.length){
                int temp=array[j];
                for(int k=j-1;k>=i;k--){
                    array[k+1]=array[k];
                }
                array[i]=temp;
                i++;
            }
            else {
                break;
            }
        }

    }

    public void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }
}
