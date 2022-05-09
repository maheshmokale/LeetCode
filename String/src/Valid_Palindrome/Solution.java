package Valid_Palindrome;

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder palinString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
           if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
               palinString.append(String.valueOf(s.charAt(i)).toLowerCase());
           }
        }
        if(palinString.length()==0) return true;
        StringBuilder temp= new StringBuilder(palinString);
        return temp.toString().equals(palinString.reverse().toString());
    }
    public boolean isPalindrome_1(String s) {
       int i=0;
       int j=s.length()-1;
       while(i<j){
           if(!(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)))){
               i++;
               continue;
           }

           if(!(Character.isAlphabetic(s.charAt(j)) || Character.isDigit(s.charAt(j)))){
               j--;
               continue;
           }

           if(String.valueOf(s.charAt(i)).toLowerCase().equals(String.valueOf(s.charAt(j)).toLowerCase())) {
               i++;
               j--;
           }
               else
                   return false;

       }
       return true;

    }
    public static void main(String[] args){
        Solution solution = new Solution();
        String s="A man, a plan, a canal: Panama";
        s="a";

        s="a";
        s="a0";
        s="A man, a plan, a canal: Panama";

        System.out.println(solution.isPalindrome_1(s));
    }
}