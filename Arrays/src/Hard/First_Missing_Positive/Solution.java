package Hard.First_Missing_Positive;

class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean containsOne=false;
        for(int num:nums){
            if(num==1)
                containsOne=true;
        }
        if(!containsOne) return 1;
        for (int i = 0; i < nums.length ; i++) {
          if(nums[i]<=0 || nums[i]> nums.length)
              nums[i]=1;
        }
        for (int i = 0; i < nums.length ; i++) {
            int x=Math.abs(nums[i]);
            if(nums[x-1]>0) nums[x-1]*=-1;
        }
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]>0) return i+1;
        }

       return nums.length+1;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        int[] nums={1,2,0};
        nums= new int[]{7,8,9,11,12};
        System.out.println(solution.firstMissingPositive(nums));
    }
}