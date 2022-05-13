package Reverse_Words_in_a_String_III;

import java.util.Arrays;

class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder temp=new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            temp.append(String.valueOf(new StringBuilder(words[i]).reverse()+" "));
        }
        return temp.toString().trim();
    }
    public static void main(String[] args){
        Solution solution= new Solution();
        String s="Let's take LeetCode contest";
        System.out.println(solution.reverseWords(s));
    }
}