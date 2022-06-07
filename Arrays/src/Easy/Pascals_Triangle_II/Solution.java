package Easy.Pascals_Triangle_II;

import java.util.*;

public class Solution {
    public static void main(String[] args){
        Solution solution=new Solution();
        int rowIndex=5;
        List<Integer> rowVals=solution.getRow(rowIndex);
        rowVals.forEach(rowVal->{
            System.out.print(rowVal+ " ");
        });
        rowVals=solution.getRowOptimize(rowIndex);
        rowVals.forEach(rowVal->{
            System.out.print(rowVal+ " ");
        });
        rowVals=solution.getRowOptimizeUsingDP(rowIndex);
    }
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> mainPascii=new ArrayList<>();

        for(int i=0;i<=rowIndex;i++){
            List<Integer> subPascii=new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if(j==0){
                    subPascii.add(1);
                    continue;
                }
                else
                {
                    subPascii.add(mainPascii.get(i-1).get(j-1)+mainPascii.get(i-1).get(j));
                }
            }
            subPascii.add(1);
            mainPascii.add(subPascii);
        }
        return mainPascii.get(rowIndex);

    }
    /*
    Lets take example for the below triangle

            1   ------------> Row 0
            1   1  -----------> Row 1
            1  2  1  ----------> Row 2
            1  3  3  1  ---------> Row 3
            1  4  6  4  1  -------> Row 4


    Each of the position can be represented as nCj  (n = row number and j = column number)

                    0c0   ------------> Row 0
            1c0    1c1  -----------> Row 1
            2c0   2c1     2c2  ----------> Row 2
            3c0    3c1    3c2    3c3  ---------> Row 3
            4c0    4c1    4c2    4c3     4c4  -------> Row 4

    Formula of  NcR = N! / (N - R)! * R!

    Note :  Nc0 >> 1  &   NcN >> 1

    Suppose we have to get the 4th Row
                              4c0    4c1    4c2    4c3     4c4  -------> Row 4
    This can be represented as : NcR   NcR+1  NcR+2  NcR+3   NcR+4

    Properties of combination :  NcR * factor = NcR+1 now if we can figure out the value of factor we can make the whole row.

                n!                         n!
            ------------ * factor =  ---------------------------
            (n-r)! * r!                (n - (r+1))! * (r+1)!

            (n-r)! * r!                      (n-r) *  (n-r-1)!         n - r
            factor = ----------------------------  =   ------------------------- = ----------
            (n - r - 1)! * (r+1) * r!            (n - r - 1)! * (r+1)     r + 1


    So, the value of factor = (n - r) / ( r + 1)

    With this we can compute the factor and get the next value
*/
    //O(n) Time complexity - Using NCR approach
    public List<Integer> getRowOptimize(int rowIndex) {
        List<Integer> rowVal=new ArrayList<>();
        long val=1;
        for (int i = 0; i <= rowIndex; i++) {
            rowVal.add((int)val);
            val=val*(rowIndex-i)/(i+1);
        }
        return rowVal;
    }
    //O(n) Time complexity - Using DP
    public List<Integer> getRowOptimizeUsingDP(int rowIndex) {
        Integer[]dp=new Integer[rowIndex+1];
        dp[0]=1;
        long prev=1;
        long curr=0;
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = 1; j <i ; j++) {
                curr=dp[j];
                dp[j]=(int)(prev+curr);
                prev=curr;
            }
            dp[i]=1;
        }
        return Arrays.asList(dp);
    }
}

