package Intersection_of_Two_Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersect=new HashSet<>();
        Set<Integer> baseValues=new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            baseValues.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(baseValues.contains(nums2[i]))
                intersect.add(nums2[i]);
        }
        int i=0;
        int[] intersectArr=new int[intersect.size()];
        for(int val:intersect){
            intersectArr[i++]=val;
        }
        return intersectArr;

    }
    public static void main(String[] args){
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        nums1= new int[]{9, 4, 9, 8, 4};
        nums2= new int[]{4, 9, 5};

        Solution solution=new Solution();
        solution.intersection(nums1,nums2);
    }
}