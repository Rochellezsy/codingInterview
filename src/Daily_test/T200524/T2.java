import java.util.Arrays;

public class T2 {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        if(arr1.length==0 || arr1.length==1)return 0;
        Arrays.sort(arr2);
        int ans=0;
        for(int i=1; i<arr1.length; i++){
            if(arr1[i]<=arr1[i-1]){
                if(arr2[arr2.length-1]<=arr1[i-1]){
                    return -1;
                }
                for(int j=0; j<arr2.length; j++){
                    if(i!=arr1.length-1 && arr2[j]>arr1[i-1] && arr2[j]>=arr1[i+1]){
                        return -1;
                    }
                    else if(i!=arr1.length-1 && arr2[j]>arr2[i-1] && arr2[j]<arr1[i+1]){
                        ans++;
                        break;
                    }
                    else if(i==arr1.length-1 && arr2[j]>arr1[i-1]){
                        ans++;
                        break;
                    }
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[]arr1={1,5,3,6,7};
        int[]arr2={1,3,2,4};
        System.out.println(new T2().makeArrayIncreasing(arr1,arr2));
    }
}
