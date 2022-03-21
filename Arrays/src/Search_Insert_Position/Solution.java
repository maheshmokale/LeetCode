package Search_Insert_Position;

public class Solution {
    public static void main(String[] args){
        Solution solution=new Solution();
        int[] nums={1,3,5,6};
        int target=7;
        System.out.println(solution.searchInsert(nums,target));
        System.out.println(solution.searchInsertEfficient(nums,target));


    }
    //Time complexity is O(n)
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0) return 0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target || nums[i]>target)
                return i;
        }
        if(nums[nums.length-1]<target)
            return nums.length;
        return 0;
    }
    //Time complexity is O(logn)
    public int searchInsertEfficient(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else
                h=mid-1;
        }
        return l;
    }

}
