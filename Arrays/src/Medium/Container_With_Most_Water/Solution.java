package Medium.Container_With_Most_Water;

class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxArea=Integer.MIN_VALUE;
        while(i<j){
            int area=((j-i)*Math.min(height[i],height[j]));
            maxArea=Math.max(maxArea,area);
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return maxArea;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        int[] heights={1,1};
        System.out.println(solution.maxArea(heights));
    }
}