// 请在下方描述你的面试题内容( 支持Markdown )
// 两 亿 一千零二 万 三千五百一十六 => 210023516

import java.util.HashMap;
import java.util.Stack;

public class Solution {
    HashMap<String, Integer>map;
    public Solution(){
        map= new HashMap<>();
        map.put("三",3);
        map.put("千",1000);
        map.put("五", 5);
        map.put("百",100);
        map.put("十", 10);
        map.put("零", 0);
        map.put("万", 10000);
        map.put("亿", 100000000);
    }

    public int getnum(String data){
        int ans = 0;
        String[]datas = data.split("万");
        if(datas.length == 1){
            return getxiao(datas[0]);
        }
        else{
            int num1 = getxiao(datas[0]);
            int num2 = getxiao(datas[1]);
            ans = num1*map.get("万")+num2;
            return ans;
        }
    }



    public int getxiao(String data){
        int ans = 0;
        Stack<Integer>stack = new Stack<>();
        if(data.charAt(0)=='十'){
            ans +=10;
        }
        for(int i=0; i<data.length(); i++){
            if(i==0 && (data.charAt(0)=='十')){
                continue;
            }
            int x = map.get(String.valueOf(data.charAt(i)));
            if(x>0 && x<=9){
                stack.add(x);
            }
            else if(x == 0){
                continue;
            }
            else{
                ans += stack.pop()*x;
            }
        }
        if(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }


    public static void main(String[] args) {
        String data = "五十五";
        String data1 = "三千零五";
        String data2 = "五十五万十";
        Solution test = new Solution();
        System.out.println(test.getxiao(data));
        System.out.println(test.getxiao(data1));
        System.out.println(test.getnum(data2));
    }
}