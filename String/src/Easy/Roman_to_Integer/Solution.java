package Easy.Roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<String, Integer> romanIntMap = new HashMap<>();

    public int romanToInt(String s) {
        initMap();
        int integerVal = 0;
        int curr = 0;
        int prev = 0;
        for (int i = 0; i < s.length(); i++) {
            curr = romanIntMap.get(String.valueOf(s.charAt(i)));
            if (i >= 1 && prev < curr) {
                integerVal += curr - 2 * prev;
                continue;
            }
            integerVal += curr;
            prev = curr;
        }
        return integerVal;
    }

    private void initMap() {
        romanIntMap.put("I", 1);
        romanIntMap.put("V", 5);
        romanIntMap.put("X", 10);
        romanIntMap.put("L", 50);
        romanIntMap.put("C", 100);
        romanIntMap.put("D", 500);
        romanIntMap.put("M", 1000);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String romanNumber = "MCMXCIV";
        System.out.println(solution.romanToInt(romanNumber));
    }
}