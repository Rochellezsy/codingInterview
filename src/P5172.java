import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P5172 {

    private static List<List<Integer>>res=new ArrayList<>();
    private static int ans=0;

    public String largestMultipleOfThree(int[] digits) {
        Arrays.sort(digits);
        if(digits[digits.length-1]==0)return String.valueOf(0);
        List<Integer>list=new ArrayList<>();
        int sum=0;
        for(int i=0;i<digits.length;i++){
            list.add(digits[i]);
            sum=sum+digits[i];
        }
        if(sum==1)return "";
        re(list,sum);
        String s="";
        int value=0;
        for(int i=0;i<res.size();i++){
            if(res.get(i).size()>value){
                value=res.get(i).size();
                StringBuilder temp=new StringBuilder();
                for (Integer integer : res.get(i)) {
                    temp.append(integer);
                }
                s=String.valueOf(temp);
            }
        }
        return s;

    }

    public void re(List<Integer>list,int sum){
        if(sum%3==0){
            if(sum>=ans){
                ans=sum;
                list=reverse(list);
                res.add(list);
            }
            return;
        }
        else {
            for(int i=0;i<list.size();i++){
                List<Integer>templist=new ArrayList<>(list);
                int temp=list.get(i);
                templist.remove(i);
                re(templist,sum-temp);
            }
        }
    }

    public List<Integer> reverse(List<Integer>list){
        List<Integer>ans=new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            ans.add(list.get(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        P5172 test=new P5172();
        int[]digits={0,1,6,7,8};

        System.out.println(test.largestMultipleOfThree(digits));
//        List<Integer>list=new ArrayList<>();
//        int sum=0;
//        for(int i=0;i<digits.length;i++){
//            list.add(digits[i]);
//            sum=sum+digits[i];
//        }
//        test.re(list,sum);
//
//        for (List<Integer> re : res) {
//            for (Integer integer : re) {
//                System.out.print(integer+",");
//            }
//            System.out.println();
//        }


    }
}
