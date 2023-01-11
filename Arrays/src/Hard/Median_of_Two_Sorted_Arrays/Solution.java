package Hard.Median_of_Two_Sorted_Arrays;

public class Solution {
    public static void main(String[] args){
        Solution solution=new Solution();
        int[] nums1={1,2};
        int[] nums2={3,4};
        System.out.println(solution.findMedianSortedArrays(nums1,nums2));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sortedNum=new int[nums1.length+nums2.length];
        int j=0;int k=0;
        for (int i = 0; i < sortedNum.length; i++) {
            if(j<nums1.length && k<nums2.length){
                if(nums1[j]<=nums2[k]){
                    sortedNum[i]=nums1[j];
                    j++;
                }
                else{
                    sortedNum[i]=nums2[k];
                    k++;
                }
            }
            else{
                if(j==nums1.length){
                    sortedNum[i]=nums2[k];
                    k++;
                }
                else{
                    sortedNum[i]=nums1[j];
                    j++;
                }

            }

        }
        if(sortedNum.length%2==0){
            return (sortedNum[sortedNum.length/2-1]+sortedNum[sortedNum.length/2])/2.0;
        }
        return sortedNum[sortedNum.length/2];

    }
}
