public class Test3 {
    int res=0;
    public int nthMagicalNumber(int N, int A, int B) {
        int min=Math.min(A,B);
        int max=Math.max(A,B);
        digui(0,min,max,1,1,N);
        return res;
    }

    public void digui(int index,int a,int b, int min, int max,int N){
        if(index==N){
            return;
        }
        else{
            res=Math.min(a*min,b*max);
            if(a*min<b*max){
                digui(index+1,a,b,min+1,max,N);
            }
            else if(a*min>b*max){
                digui(index+1,a,b,min,max+1,N);
            }
            else{
                digui(index+1,a,b,min+1,max+1,N);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Test3().nthMagicalNumber(1000000000,40000,40000));
    }
}
