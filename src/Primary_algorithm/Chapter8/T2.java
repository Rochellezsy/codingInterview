package Primary_algorithm.Chapter8;

public class T2 {
    public int countPrimes(int n) {
        boolean[] zhishu=new boolean[n];
        int count=0;
        for(int i=2;i<n;i++){
            if(zhishu[i]==false){
                count++;
                for(int j=2;i*j<n;j++){
                    zhishu[j]=true;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }

}
