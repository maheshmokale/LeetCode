package Easy.Remove_Element;

public class Solution {
    public static void main(String[] args){
        Solution solution=new Solution();
        int[]nums={3,2,2,3};
        System.out.println(solution.removeElement(nums,3));
    }
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
    return j;
    }
}
