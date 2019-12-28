import java.util.ArrayList;

public class Solution_2 {
    public int longestCommonSubsequence(String text1, String text2) {
        ArrayList<ArrayList<Character>> list1=new ArrayList<>();
        list1.add(new ArrayList<>());

        for(int i=0;i<text1.length();i++){
            int size=list1.size();
            for(int j=0;j<size;j++){
                ArrayList<Character>temp=new ArrayList<>(list1.get(j));
                temp.add(text1.charAt(i));
                list1.add(temp);
            }
        }

        ArrayList<ArrayList<Character>> list2=new ArrayList<>();
        list2.add(new ArrayList<>());

        for(int i=0;i<text2.length();i++){
            int size=list2.size();
            for(int j=0;j<size;j++){
                ArrayList<Character>temp=new ArrayList<>(list2.get(j));
                temp.add(text2.charAt(i));
                list2.add(temp);
            }
        }

        int listsize=list1.size();
        int result=0;
        for(int i=0;i<listsize;i++){
            if(list2.contains(list1.get(i))){
                result=Math.max(result,list1.get(i).size());
            }
        }
        return result;

    }
}
