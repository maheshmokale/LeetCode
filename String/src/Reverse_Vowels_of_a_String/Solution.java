package Reverse_Vowels_of_a_String;

import sun.plugin.net.protocol.jar.CachedJarURLConnection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        char[] sChar=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        Set<Character> vowels=new HashSet<>();
        vowels.addAll(Arrays.asList('a','e','i','o','u'));
        while(i<j){
            if(!vowels.contains(Character.toLowerCase(sChar[i]))){
                i++;
                continue;
            }
            if(!vowels.contains(Character.toLowerCase(sChar[j]))){
                j--;
                continue;
            }
            char temp=sChar[i];
            sChar[i]=sChar[j];
            sChar[j]=temp;
            i++;
            j--;
        }
        return String.valueOf(sChar);
    }
    public static void main(String [] args){
        Solution solution=new Solution();
        System.out.println(solution.reverseVowels("Aa"));
    }
}