package Medium.Longest_Palindromic_Substring;

public class Solution1 {
    public String longestPalindrome(String s) {
        if(s==null ||s.length()==1) return s;
        int i=0;
        int j=s.length()-1;
        int[] dp={i,j};
        int max=0;
        while(i<j){
                if(s.charAt(i)==s.charAt(j) && max<=j-i+1){
                    if(isPalindrom(s,i,j)){
                        if(max<j-i+1){
                            dp=new int[]{i,j};
                            max=j-i+1;
                        }
                    }
                }
                j--;
                if(j<=i){
                    i++;
                    j=s.length()-1;
                }
        }
        if(max==0) return s.substring(0,1);
        return s.substring(dp[0],dp[1]+1);
    }
    public static boolean isPalindrom(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Solution1 solution1=new Solution1();
        System.out.println(solution1.longestPalindrome("aaca"));
    }
    }
