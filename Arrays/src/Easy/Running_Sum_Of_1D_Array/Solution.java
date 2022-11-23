package Easy.Running_Sum_Of_1D_Array;

import java.util.Arrays;

public class Solution {
    public int[] runningSum(int[] nums) {
        if(nums.length<=1) return nums;
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args){
        Solution solution=new Solution();
        int[] nums={1,2,3,4};
        nums=solution.runningSum(nums);
        Arrays.stream(nums).forEach(a->System.out.print(a+" "));
    }
}
