package Easy.First_Unique_Character_in_a_String;

import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> charMap=new HashMap<>();
        int index=s.length();
        for (int i = 0; i < s.length(); i++) {
            if(!charMap.containsKey(s.charAt(i))){
                charMap.put(s.charAt(i),i);
            }
            else
                charMap.put(s.charAt(i),-1);
        }
        for(Character charVal:charMap.keySet()){
            if(charMap.get(charVal)!=-1)
                index=Math.min(charMap.get(charVal),index);

        }
        if(index==s.length()) return -1;
        return index;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        String s = "aadadaad";
        System.out.println(solution.firstUniqChar(s));
    }
}