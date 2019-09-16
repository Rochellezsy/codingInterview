public class P3 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false

    public boolean duplicate(int []numbers,int length,int [] duplication) {
        if(numbers==null || length<=0){
            return false;
        }
        for(int i=0;i<length;i++){
            if(numbers[i]<0 || numbers[i]>=length){
                return false;
            }
        }
        for(int i=0;i<length;i++){
            if(numbers[i]!=i){
                if(numbers[numbers[i]]==numbers[i]){
                    duplication[0]=numbers[i];
                    return true;
                }
                swap(numbers[i],numbers[numbers[i]]);


            }
        }
        return false;
    }

    public void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;

    }



    public static void main(String[] args){


    }

}
