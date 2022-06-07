package Easy.Majority_Element;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args){
        int[] nums={3,2,3};
        Solution solution=new Solution();
        solution.majorityElement(nums);
        solution.majorityElementOptimized(nums);

    }
    //O(n) Time and O(n) Space
    public int majorityElement(int[] nums) {
        int majEleVal=0;
        int majElement=0;
        Map<Integer,Integer> majorElement=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!majorElement.containsKey(nums[i]))
                majorElement.put(nums[i],1);
            else{
                majorElement.put(nums[i],majorElement.get(nums[i])+1);
            }
            if(majorElement.get(nums[i])>majEleVal){
                majEleVal=majorElement.get(nums[i]);
                majElement=nums[i];
            }
        }
        return majElement;
    }
    //O(n) Time and O(1) Space
    // Moore voting algorithm
    public int majorityElementOptimized(int[] nums) {
        int majorityElement=0;
        int count=0;
        for (int num:nums){
           if(count==0)
               majorityElement=num;
           if(majorityElement==num)
               count++;
           else
               count--;

       }
       return majorityElement;
    }
}
