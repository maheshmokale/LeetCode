package Easy.Fizz_Buzz;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzzList=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i%3==0 && i%5==0){
                fizzBuzzList.add("FizzBuzz");
                continue;
            }
            if(i%3==0){
                fizzBuzzList.add("Fizz");
                continue;
            }
            if(i%5==0){
                fizzBuzzList.add("Buzz");
                continue;
            }
            else
                fizzBuzzList.add(String.valueOf(i));
        }
        return fizzBuzzList;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        List<String> list=solution.fizzBuzz(15);
        list.stream().forEach(val->System.out.println(val));
    }
}