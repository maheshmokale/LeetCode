package Easy.Keyboard_Row;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        String firstRow="qwertyuiop";
        String secondRow="asdfghjkl";
        String thirdRow="zxcvbnm";
        List<String> testList=new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word=words[i];
            int j;
            for (j = 0; j < word.length(); j++) {
                if(firstRow.indexOf(String.valueOf(word.charAt(j)).toLowerCase())==-1) break;
            }
            if(j==word.length()){
                testList.add(word);
                continue;
            }
            for (j = 0; j < word.length(); j++) {
                if(secondRow.indexOf(String.valueOf(word.charAt(j)).toLowerCase())==-1) break;
            }
            if(j==word.length()){
                testList.add(word);
                continue;
            }
            for (j = 0; j < word.length(); j++) {
                if(thirdRow.indexOf(String.valueOf(word.charAt(j)).toLowerCase())==-1) break;
            }
            if(j==word.length()){
                testList.add(word);
                continue;
            }
        }
    return testList.toArray(new String[]{});
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        String[] wordInaRow= {"omk"};
        String[]  wordList=solution.findWords(wordInaRow);
        for (String val:wordList)
            System.out.println(val);

    }
}