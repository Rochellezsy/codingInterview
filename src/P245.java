public class P245 {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int len=words.length;
        int ans=len;
        int x=-1;
        int y=-1;
        for(int i=0; i<len; i++){
            if(words[i].equals(word1)){
                x=i;
                if(y!=-1 && x!=y){
                    ans=Math.min(ans, Math.abs(x-y));
                }
            }
            if(words[i].equals(word2)){
                y=i;
                if(x!=-1 && x!=y){
                    ans=Math.min(ans, Math.abs(x-y));
                }
            }
        }
        return ans;

    }
}
