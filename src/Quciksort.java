public class Quciksort {

    public void quciksort(int[] arr,int l,int r){
        if(l>=r){
            return;
        }

        int p=Partition(arr,l,r);
        quciksort(arr,l,p-1);
        quciksort(arr,p+1,r);
    }

    public int Partition(int[] arr,int l,int r){
        int value=arr[l];
        int i=l+1;//arr[l,...,j]<v,arr[j,...,i]>v
        int j=r;
/*
        for(int i=l;i<r;i++){
            if(arr[i]<value){
                j++;
                swap(arr,i,j);

            }
        }

 */
        while(true){
            while(arr[i]<value&& i<r ){
                i++;
            }
            while(arr[j]>value && j>l){
                j--;
            }
            if(i>=j){
                break;
            }
            swap(arr,i,j);
        }
        swap(arr,l,j);

        return j;
    }

    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {

        int[] arr={5,1,2,3,6,7,8};
        Quciksort test=new Quciksort();
        test.quciksort(arr,0,6);


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }



}
