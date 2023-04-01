package Easy.Roman_To_Integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;
        //Create a Map of Roman to Integer values
        Map<Character, Integer> romanIntMap = new HashMap<>();
        romanIntMap.put('I', 1);
        romanIntMap.put('V', 5);
        romanIntMap.put('X', 10);
        romanIntMap.put('L', 50);
        romanIntMap.put('C', 100);
        romanIntMap.put('D', 500);
        romanIntMap.put('M', 1000);

        int number = 0;
        int tempNum = 0;

        for (int i = 0; i < s.length(); i++) {
            char romanNum = s.charAt(i);

            if (romanIntMap.get(romanNum) > tempNum) {
                number += romanIntMap.get(romanNum) - 2 * tempNum;
            } else {
                number += romanIntMap.get(romanNum);
            }
            tempNum = romanIntMap.get(romanNum);
        }

        return number;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("LVIII"));
    }

}
