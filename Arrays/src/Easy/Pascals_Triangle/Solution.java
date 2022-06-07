package Easy.Pascals_Triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        int num=5;
        Solution solution=new Solution();
        List<List<Integer>> pascii=solution.generate(num);
        pascii.forEach(row->{
            row.forEach(rowVal->{
                System.out.print(rowVal);
            });
            System.out.println();
        });
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainPascii=new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subPascii=new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if(j==0){
                    subPascii.add(1);
                    continue;
                }
                else{
                   subPascii.add(mainPascii.get(i-1).get(j-1)+mainPascii.get(i-1).get(j));
                }
            }
            subPascii.add(1);
            mainPascii.add(subPascii);
        }
        return mainPascii;
    }
    //1
    //11
    //121
    //1331
    //14641
}
