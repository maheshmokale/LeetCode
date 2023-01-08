package Medium.Letter_Combinations_of_a_Phone_Number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        Map<String,String> digitLetter=new HashMap<>();
        digitLetter.put("2","abc");digitLetter.put("3","def");digitLetter.put("4","ghi");digitLetter.put("5","jkl");
        digitLetter.put("6","mno");digitLetter.put("7","pqrs");digitLetter.put("8","tuv");digitLetter.put("9","wxyz");
        List<String> letterCombination=new ArrayList<>();
        if(digits.length()<1) return letterCombination;

        for (int i = digits.length()-1; i >=0; i--) {

            String letters=digitLetter.get(String.valueOf(digits.charAt(i)));
            if(letterCombination.isEmpty()){
                for (int j = 0; j < letters.length(); j++) {
                    letterCombination.add(String.valueOf(letters.charAt(j)));
                }
            }
            else{
                List<String> tempLetter=new ArrayList<>(letterCombination);
                letterCombination.removeAll(tempLetter);
                for (String letter:tempLetter){
                    for (int j = 0; j < letters.length(); j++) {
                        letterCombination.add(String.valueOf(letters.charAt(j))+letter);
                    }
                }
            }
        }
        return letterCombination;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        solution.letterCombinations("2");
    }
}