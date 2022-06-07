package Easy.Implement_strStr;

class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        String haystack="";
        String needle="";



        haystack="hello";
        needle="ll";
        haystack="aaa";
        needle="aaaa";
        haystack="mississippi";
        needle="issip";
        System.out.println(solution.strStr(haystack,needle));
    }
}