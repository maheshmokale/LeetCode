package Easy.Binary_Search;

public class Solution {

    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }

    public int binarySearch(int left, int right,int[] nums,int target){
        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            else if (target < nums[mid])
                return binarySearch(left, mid - 1, nums, target);
            else if (target > nums[mid])
                return binarySearch(mid + 1, right, nums, target);
        }
        return -1;
    }
        public static void main (String[] args){
            Solution solution = new Solution();
            int[] arr = {5};
            System.out.println(solution.search(arr, 0));
        }


}