import java.util.LinkedList;

public class test3 {
    public boolean stoneGame(int[] piles) {
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<piles.length;i++){
            list.add(piles[i]);
        }

        int ans1=0;
        int ans2=1;
        int level=1;
        while(list.size()!=0){
            if(list.size()!=0 && level%2!=0){
                if(list.peekFirst()>=list.peekLast()){
                    ans1+=list.pollFirst();
                }
                else{
                    ans1+=list.pollLast();
                }
                level++;
            }

            if(list.size()!=0 && level%2==0){
                if(list.peekFirst()>=list.peekLast()){
                    ans2+=list.pollFirst();
                }
                else{
                    ans2+=list.pollLast();
                }
                level++;
            }

        }
        return ans1>ans2;

    }

    public static void main(String[] args) {
        int[]nums={5,3,4,5};
        System.out.println(new test3().stoneGame(nums));
    }
}
