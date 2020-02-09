package Intermediate_algorithm.Chapter9;

import java.util.Arrays;

public class T4 {
    public int leastInterval(char[] tasks, int n) {
        int []nums=new int[26];
        for (char task : tasks) {
            nums[task-'A']++;
        }
        Arrays.sort(nums);

        int count=(nums[25]-1)*(n+1)+1;
        int i=24;

        while(nums[i]==nums[25] && i>=0){
            count++;
            i--;
        }
        return Math.max(count,tasks.length);

    }

}
