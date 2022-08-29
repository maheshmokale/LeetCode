package Easy.First_Unique_Character_in_a_String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args){
            Solution solution=new Solution();
            System.out.println(solution.firstUniqChar("leetcode"));
    }

    public int firstUniqChar(String s) {
        Map<Character,Integer> charCount=new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(charCount.containsKey(s.charAt(i))){
                charCount.put(s.charAt(i),-1);
            }
            else{
                charCount.put(s.charAt(i),i);
            }
        }
        for(int val:charCount.values()){
            if(val!=-1)
                return val;
        }
        return -1;
    }
}
