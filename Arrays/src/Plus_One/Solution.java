package Plus_One;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Solution solution=new Solution();
        int[] digits={9,9,9};
        System.out.println(solution.plusOneOptimized(digits));

        System.out.println(solution.plusOne(digits));


    }
    //O(n) Time and O(1) Space
    public int[] plusOneOptimized(int[] digits) {
        if(digits.length==0) return null;
        int n=digits.length;
        for (int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newArr= new int[n+1];
        newArr[0]=1;
        return newArr;
    }
    //O(n) Time and O(n) Space
    public int[] plusOne(int[] digits) {
        if(digits.length==0) return null;
       int carry=0;
       int n=digits.length;
       int newArr[]=new int[n+1];
       digits[n-1]+=1;
           for(int i=n-1;i>=0;i--){
               digits[i]+=carry;
               carry=0;
               if(digits[i]>9){
                   digits[i]=0;
                   carry=1;
               }
               newArr[i+1]=digits[i];
           }
           if(carry>0){
               newArr[0]=carry;
                return newArr;
           }

       return digits;
    }

}
