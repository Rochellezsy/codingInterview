package Primary_algorithm.Chapter2;

public class T7 {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        int hlen=haystack.length();
        int nlen=needle.length();
        int i=0;
        int j=0;
        int ans;
        while(i<hlen && j<nlen){
            if(haystack.charAt(i)!=needle.charAt(j)){
                if(j>0){
                    i=i-j+1;
                    j=0;
                    continue;
                }
                i++;
            }
            else if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }

        }
        ans=i-j;
        if(j==nlen) return ans;
        return -1;

    }

    public static void main(String[] args) {
        T7 test=new T7();
        System.out.println(test.strStr("mississippi"
                ,"pi"));
    }
}
