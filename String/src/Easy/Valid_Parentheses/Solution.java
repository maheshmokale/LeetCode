package Easy.Valid_Parentheses;

import java.util.*;

class Solution {
    Map<String,Integer> paranthVal=new HashMap<>();
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> stack=new Stack<>();
        for(char paranth : s.toCharArray()){
            if(paranth =='(' || paranth =='{' || paranth =='['){
                stack.push(paranth);
            }
            else if(stack.isEmpty()) return false;
            else if(paranth ==')' &&  stack.pop() !='(') return false;
            else if(paranth =='}' &&  stack.pop() !='{') return false;
            else if(paranth ==']' &&  stack.pop() !='[') return false;
        }
    return stack.isEmpty();
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        String paranthese="([}}])";
        System.out.println(solution.isValid(paranthese));
    }
}