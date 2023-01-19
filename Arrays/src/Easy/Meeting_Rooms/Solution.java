package Easy.Meeting_Rooms;

import java.util.Arrays;

public class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i-1][1]>intervals[i][0]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        //int[][] intervals={{0,30},{5,10},{15,20}};
        int[][] intervals={{7,10},{2,4}};
        //int[][] intervals={{1,5},{8,9}};

        System.out.println(solution.canAttendMeetings(intervals));

    }
}