package Primary_algorithm.Chapter5;

public class T2 {
    boolean isBadVersion(int version){
        if(version>=4)return false;
        return true;
    }
    public int firstBadVersion(int n) {
        int left=1;
        int right=n;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(!isBadVersion(mid)){
                left=mid+1;
            }
            else if(isBadVersion(mid)){
                right=mid;
            }
        }
        return left;
    }
}
