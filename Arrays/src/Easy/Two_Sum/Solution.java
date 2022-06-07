package Easy.Two_Sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    //O(n) Time Complexity
    //O(n) Space Complexity

    public int[] twoSumNew(int[] nums, int target) {
        Map<Integer,Integer> numStore=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(numStore.containsKey(target-nums[i])){
                return new int[]{numStore.get(target-nums[i]), i};
            }
            else
                numStore.put(nums[i],i);
        }
        return new int[]{0, 0};
    }

    //O(n^2) Time Complexity
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j]))
                    return new int[]{i, j};
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 3};
        int target = 6;
        int[] output = s.twoSumNew(nums, target);
        System.out.println(output[0] + "," + output[1]);
    }
}
