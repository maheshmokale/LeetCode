package Easy.Valid_Parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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
        String paranthese="){";
       // System.out.println(solution.isValid(paranthese));
        System.out.println(solution.isValid1(paranthese));
    }

    public boolean isValid1(String s) {
        if(s==null || s.length()<2) return false;
        if(s.length()%2!=0) return false;
        int i=0;

        Stack<Character> stackStore=new Stack<>();
        while(i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)=='['){
                stackStore.push(s.charAt(i));
            }
            if(stackStore.isEmpty()) return false;
            else if(s.charAt(i)==')' && stackStore.pop()!='(') return  false;
            else if(s.charAt(i)==']' && stackStore.pop()!='[') return  false;
            else if(s.charAt(i)=='}' && stackStore.pop()!='{') return  false;

            i++;
        }
        if(!stackStore.isEmpty()) return false;
        return true;
    }
}