package Medium.String_to_Integer_atoi;

class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int i=0;
        double n=0;
        boolean positive=false;
        boolean negative=false;
        if(s.length()==0) return 0;
        if(i<s.length() && s.charAt(i)=='+'){
            positive=true;
            i++;
        }
        if(i<s.length() && s.charAt(i)=='-'){
            negative=true;
            i++;
            if(positive) return 0;
        }
        if(i<s.length() && (s.charAt(i)<'0' || s.charAt(i)>'9')) return 0;
        while(i<s.length()){
            if(s.charAt(i)>='0' && s.charAt(i)<='9') {
                n = n * 10 + (s.charAt(i) - '0');
            }
            else {
                break;
            }
            i++;
        }
        n=(negative)? -n:n;
        n=(n>Integer.MAX_VALUE)?Integer.MAX_VALUE:n;
        n=(n<Integer.MIN_VALUE)?Integer.MIN_VALUE:n;

        return (int)n;
    }

    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.myAtoi("+1"));
    }
}
