package Palindrome_Number;

public class Solution {
    public static void main(String[] args){
        Solution solution= new Solution();
        System.out.println(solution.isPalindrome(121));
        System.out.println(solution.isPalindromeNew(121));

    }
    //Solution 1
    public boolean isPalindrome(int x) {
        String number=String.valueOf(x);
        for(int i=0;i<number.length()-1/2;i++){
            if(!(number.charAt(i)==number.charAt(number.length()-1-i)))
                return false;
        }
        return true;
    }
//1234
    //Solution 2
    public boolean isPalindromeNew(int x) {
       int y=x;
       int rev=0;
       while(x>0){
           rev*=10;
           rev+=x%10;
            x/=10;
       }
        if(y==rev) return true;
        return false;
    }
}
