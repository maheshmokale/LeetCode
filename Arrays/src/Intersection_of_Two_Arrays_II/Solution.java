package Intersection_of_Two_Arrays_II;

import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    	Map<Integer,Integer> valueMap=new HashMap<>();
    	List<Integer> listOfCommon=new ArrayList<>();
    	for (int num: nums1){
    		if(valueMap.containsKey(num))
				valueMap.put(num,valueMap.get(num)+1);
    		else
    			valueMap.put(num,1);
		}
    	for(int num:nums2){
    		if(valueMap.containsKey(num)){
				listOfCommon.add(num);
				if(valueMap.get(num)-1==0)
					valueMap.remove(num);
				else
					valueMap.put(num,valueMap.get(num)-1);
			}
		}
		int[] intersectArr = listOfCommon.stream().mapToInt(i -> i).toArray();

    	return intersectArr;
    }
	public static void main(String[] args){
		int[] nums1={1,2,2,1};
		int[] nums2={2,2};
		nums1= new int[]{9, 4, 9, 8, 4};
		nums2= new int[]{4, 9, 5};

		Solution solution=new Solution();
		solution.intersect(nums1,nums2);
	}
}