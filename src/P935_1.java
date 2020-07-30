import java.util.Arrays;

public class P935_1 {
    int[][]path={{4, 6}, {6, 8}, {7, 9}, {4, 8}, {3, 9, 0}, {}, {1, 7, 0}, {2, 6}, {1, 3}, {4, 2}};
    int count=0;

    public int count(int num){
        boolean[]arr=new boolean[10];
        if(num==0)return 0;
        search(0, num, arr);
        return count;
    }

    public void search(int start, int num, boolean[] arr){
        if(arr[start]){
            return;
        }
        if(start == num){
            count++;
        }
        else{
            arr[start] = true;
            for(int p:path[start]){
                search(p, num, arr);
            }
            arr[start] = false;
        }
    }

    public static void main(String[] args) {
        P935_1 test=new P935_1();
        System.out.println(test.count(4));
    }
}
