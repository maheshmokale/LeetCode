package Easy.Reverse_String;

class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        char[] s={'h','e','l','l','o'};
        s= new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(s);
        System.out.println(String.valueOf(s));
    }
}