package Word_Pattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] stringVals= s.split(" ");
        if(stringVals.length!=pattern.length()) return false;

        Map<Character,String> mapChar= new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if(mapChar.containsKey(pattern.charAt(i))){
                if(!mapChar.get(pattern.charAt(i)).equals(stringVals[i])){
                    return false;
                }
            }
            else{
                if(mapChar.containsValue(stringVals[i]))
                    return false;
                mapChar.put(pattern.charAt(i),stringVals[i]);
            }
        }
        return true;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        String pattern="aba";
        String s="cat cat cat dog";
        System.out.println(solution.wordPattern(pattern,s));
    }
}