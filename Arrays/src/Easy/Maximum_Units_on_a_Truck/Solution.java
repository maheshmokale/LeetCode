package Easy.Maximum_Units_on_a_Truck;

import java.util.Arrays;

public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        if(truckSize==0) return 0;
        int truckLoad=0;
        int noOfUnit=0;
        Arrays.sort(boxTypes,(int[] a, int[] b) -> b[1]-a[1]);
        for (int i = 0; i < boxTypes.length; i++) {
            if(truckLoad+boxTypes[i][0]<=truckSize){
                truckLoad+=boxTypes[i][0];
                noOfUnit+=boxTypes[i][0]*boxTypes[i][1];
            }
            else{
                noOfUnit+=(truckSize-truckLoad)*boxTypes[i][1];
                break;
            }
        }
        return noOfUnit;
    }

    public static void main(String[] args){
        Solution solution=new Solution();
        int[][] boxTypes={{1,3},{2,2},{3,1}};
        boxTypes= new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int truckSize=10;
        System.out.println(solution.maximumUnits(boxTypes,truckSize));
    }
}
