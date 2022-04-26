package Find_All_Numbers_Disappeared_in_an_Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappVal=new ArrayList<>();
        Set<Integer> numbers= new HashSet<>();
        for (Integer val: nums){
            numbers.add(val);
        }
        for (int i = 1; i <= nums.length; i++) {
            if(!numbers.contains(i))
                disappVal.add(i);
        }
        return disappVal;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> disapp=solution.findDisappearedNumbers(nums);
        disapp.forEach(val->System.out.println(val));
    }
}