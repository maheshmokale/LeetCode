package Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setNums=new HashSet<>();
        for(int val:nums){
            if(setNums.contains(val))
                return true;
            else
                setNums.add(val);
        }
        return false;
    }

}