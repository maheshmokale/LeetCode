package Easy.Summary_Ranges;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> summaryRange=new ArrayList<>();
        if(nums.length==0) return summaryRange;
        String range=null;
        int prev=Integer.MIN_VALUE;
        boolean isSequence=false;
        for (int i = 0; i <nums.length; i++) {
            if(range==null){
                range=String.valueOf(nums[i]);
                prev=nums[i];
                continue;
            }
            int diff=Math.abs(nums[i]-prev);
            if(diff==1){
                if(!isSequence)
                    range=range.concat("->");
                isSequence=true;
                prev=nums[i];
                continue;
            }
            else if (diff>1 && isSequence){
                isSequence=false;
                range=range.concat(String.valueOf(prev));
            }
            summaryRange.add(range);
            range=String.valueOf(nums[i]);
            prev=nums[i];

        }
        if(range.contains("->"))
            range=range.concat(String.valueOf(nums[nums.length-1]));
        summaryRange.add(range);
        return summaryRange;
    }

    public static void main(String[] args){
        Solution solution=new Solution();
        int[] nums={-2147483648,-2147483647,2147483647};
        List<String> summaryRange=solution.summaryRanges(nums);
        summaryRange.forEach(val->{
            System.out.println(val);
        });
    }
}