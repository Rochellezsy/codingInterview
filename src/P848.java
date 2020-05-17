public class P848 {
    public String shiftingLetters(String S, int[] shifts) {
        StringBuilder ans=new StringBuilder();
        int cnt=0;
        for(int i=S.length()-1; i>=0; i--){
            cnt = (cnt + shifts[i]) % 26;
            int index = (S.charAt(i) - 'a' + cnt) % 26;
            ans.append((char)('a' + index));
        }
        return String.valueOf(ans.reverse());
    }

    public static void main(String[] args) {
        char c='a'+1;
        System.out.println(c);

    }
}
