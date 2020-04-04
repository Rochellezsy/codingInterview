public class P165 {
    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");

        int len=Math.max(v1.length,v2.length);
        for(int i=0; i<len; i++){
            int a;
            int b;
            if(i>=v1.length){
                a=0;
            }
            else{
                a=Integer.parseInt(v1[i]);
            }
            if(i>=v2.length){
                b=0;
            }
            else{
                b=Integer.parseInt(v2[i]);
            }

            if(a>b)return 1;
            if(a<b)return -1;
        }
        return 0;

    }

    public static void main(String[] args) {
        String s1="1";
        String s2="1.1";
        System.out.println(new P165().compareVersion(s1,s2));
    }
}
