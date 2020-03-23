import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 */


public class P17 {
    List<String> res=new ArrayList<>();

    public void back(String combination,String digits){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        if(digits.length()==0){
            res.add(combination);
        }
        else {
            String number=digits.substring(0,1);
            String numberString=map.get(number);

            for(int i=0;i<numberString.length();i++){
                String add=numberString.substring(i,i+1);
                String nextdigits=digits.substring(1);
                back(combination+add,nextdigits);
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length()!=0){
            back("",digits);
        }
        return res;

    }
}
