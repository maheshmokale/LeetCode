package Medium.Longest_Palindromic_Substring;

class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        int j=s.length()-1;
        int max=Integer.MIN_VALUE;
        int[] range={0,0};
        for (int i = 0; i <s.length(); i++) {
            for (int k = s.length()-1; k >i && (max<k-i); k--) {
                if(s.charAt(i)==s.charAt(k)){
                if(isPalindrom(s,i,k)){
                        max=k-i;
                        range[0]=i;
                        range[1]=k;
                }
                }
            }
        }
        return s.substring(range[0],range[1]+1);
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.longestPalindrome("babad"));
    }
    public boolean isPalindrom(String s,int i,int j){
        while (i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }
            else{
                return false;
            }
        }
        return true;
    }


}