package Easy.Plus_One;

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
    public int[] plusOneNew(int[] digits) {
        if(digits.length==0) return digits;
        if(digits[digits.length-1]<9){
            digits[digits.length-1]+=1;
            return digits;
        }
        digits[digits.length-1]=0;
        int carry=1;
        int i=digits.length-2;
        while(i>=0){
            if(digits[i]+carry>9){
                digits[i]=(digits[i]+carry)%10;
                carry=1;
            }
            else{
                digits[i]+=carry;
                carry=0;
            }
            i--;
        }
        int[] newArr=new int[digits.length+1];
        i=digits.length;
        if(carry>=1){
            while(i>=1){
                newArr[i]=digits[i-1];
                i--;
            }
            newArr[0]=carry;
            return newArr;
        }
        return digits;
    }

}
