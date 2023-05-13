package Easy.Lucky_Numbers_in_a_Matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        Solution solution=new Solution();
        int[][] matrix={{3,7,8},{9,11,13},{15,16,17}};
        matrix= new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        matrix = new int[][]{{7, 8}, {1, 2}};
        System.out.println(solution.luckyNumbers(matrix).toString());
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumber=new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                min=Math.min(min,matrix[i][j]);
            }
            luckyNumber.add(min);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int max=Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                max=Math.max(max,matrix[j][i]);
            }
            if(luckyNumber.contains(max)) {
                luckyNumber.clear();
                luckyNumber.add(max);
            }
        }
        if(luckyNumber.size()>1) luckyNumber.clear();
        return luckyNumber;
    }

}
