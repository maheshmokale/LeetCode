package Easy.Ransom_Note;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mapChar = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            if (mapChar.containsKey(ransomNote.charAt(i))) {
                mapChar.put(ransomNote.charAt(i), mapChar.get(ransomNote.charAt(i)) + 1);
            } else {
                mapChar.put(ransomNote.charAt(i), 1);
            }
        }
        for (int i = 0; i < magazine.length(); i++) {
            if (mapChar.containsKey(magazine.charAt(i))) {
                mapChar.put(magazine.charAt(i), mapChar.get(magazine.charAt(i)) - 1);
                if (mapChar.get(magazine.charAt(i)) == 0)
                    mapChar.remove(magazine.charAt(i));

            }
        }
        if (mapChar.size() > 0) return false;
        else return true;

    }

        public boolean canConstruct_Optimized(String ransomNote, String magazine) {
            int[] alphabets_counter = new int[26];

            for (char c : magazine.toCharArray())
                alphabets_counter[c-'a']++;

            for (char c : ransomNote.toCharArray()){
                if (alphabets_counter[c-'a'] == 0) return false;
                alphabets_counter[c-'a']--;
            }
            return true;
        }


    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        Solution solution = new Solution();
        System.out.println(solution.canConstruct_Optimized(ransomNote, magazine));
    }
}