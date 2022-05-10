package Valid_Anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> anagramMap=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if(anagramMap.containsKey(s.charAt(i)))
                anagramMap.put(s.charAt(i),anagramMap.get(s.charAt(i))+1);
            else
                anagramMap.put(s.charAt(i),1);

        }
        for (int i = 0; i < s.length(); i++) {
            if(anagramMap.containsKey(t.charAt(i))){
                if(anagramMap.get(t.charAt(i))-1==0)
                    anagramMap.remove(t.charAt(i));
                else
                    anagramMap.put(t.charAt(i),anagramMap.get(t.charAt(i))-1);
            }
        }
        if(anagramMap.size()>0) return false;
        else return true;
    }

    public boolean isAnagram_Slow(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] sChars=s.toCharArray();
        char[] tChars=t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        s=String.valueOf(sChars);
        t=String.valueOf(tChars);
        if(s.equals(t)) return true;
        else return false;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        String s="";
        String t="";
        s="rat";
        t="car";
        System.out.println(solution.isAnagram(s,t));
    }
}