package Google.Chapter1;

public class T1 {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder temp=new StringBuilder();
        temp.append(A);

        int p=B.length()/A.length()+1;
        int count=p+1;
        while(p>0){
            temp.append(A);
            p--;
        }
        if(!judge(temp,B))return -1;

        while(judge(temp,B)){
            temp.delete(temp.length()-A.length(),temp.length());
            count--;
        }
        return count+1;

    }

    public boolean judge(StringBuilder fu,String zi){
        for(int i=0;i<fu.length();i++){
            if(fu.charAt(i)==zi.charAt(0)){
                int j=0;
                while(j<zi.length()&&i+j<fu.length()&&fu.charAt(i+j)==zi.charAt(j)){
                    j++;
                }
                if(j==zi.length()){
                    return true;
                }else {
                    continue;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String A="abc";
        String B="cabcabca";
        T1 test=new T1();
        System.out.println(test.repeatedStringMatch(A,B));

    }
}
