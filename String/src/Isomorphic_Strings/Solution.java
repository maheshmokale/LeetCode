package Isomorphic_Strings;

import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        if(s.length() ==1 && t.length()==1) return true;
        Map<Character,Character> replaceString=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(replaceString.containsKey(s.charAt(i))){
                    if(t.charAt(i)!=replaceString.get(s.charAt(i)))
                        return false;
            }

            else{
                if(replaceString.containsValue(t.charAt(i))) return false;
                replaceString.put(s.charAt(i), t.charAt(i));

            }
        }
        return true;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        String s="badc";
        String t="baba";

       // s="egcd";
       // t="adfd";
        System.out.println(solution.isIsomorphic(s,t));
    }
}