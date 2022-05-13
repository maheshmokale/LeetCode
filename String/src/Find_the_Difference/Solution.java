package Find_the_Difference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0)
            return t.charAt(0);
        List<Character> characterList=new ArrayList<>();
        for (int i = 0; i <t.length(); i++) {
            characterList.add(t.charAt(i));
        }
        for (int i = 0; i <s.length(); i++) {
            if(characterList.contains(s.charAt(i)))
                characterList.remove(Character.valueOf(s.charAt(i)));
        }
        return characterList.get(0);

    }
    public static void main(String[] args){
        Solution solution=new Solution();
        String s = "";
        String t="y";
        System.out.println(solution.findTheDifference(s,t));
    }
}