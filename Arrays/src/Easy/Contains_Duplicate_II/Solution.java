package Easy.Contains_Duplicate_II;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args){
        int[] nums={1,2,3,1,2,3};
        int k=2;
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyDuplicate(nums,k));
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> duplicateHolder=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(!duplicateHolder.containsKey(nums[i]))
                duplicateHolder.put(nums[i],i);
            else
                if(Math.abs(i-duplicateHolder.get(nums[i]))<=k)
                    return true;
                else
                    duplicateHolder.put(nums[i],i);
        }
        return false;
    }
}