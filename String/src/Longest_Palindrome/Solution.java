package Longest_Palindrome;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        int totalChar=0;
        boolean oddPaliFound=false;
        Map<Character,Integer> charCountMap= new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char character=s.charAt(i);
            if(charCountMap.containsKey(character)){
                charCountMap.put(character,charCountMap.get(character)+1);
            }
            else{
                charCountMap.put(character,1);
            }
        }
        for (char charValue:charCountMap.keySet()){
            int charCount=charCountMap.get(charValue);
            if(charCountMap.get(charValue)%2==0){
                totalChar+=charCount;
                continue;
            }
            if(charCountMap.get(charValue)%2==1){
                totalChar+=charCount-1;
                oddPaliFound=true;
            }
        }
        if(oddPaliFound)
            totalChar+=1;
        return totalChar;
    }

    public static void main(String[] args){
        Solution solution= new Solution();
        String s="bb";
        System.out.println(solution.longestPalindrome(s));
    }
}