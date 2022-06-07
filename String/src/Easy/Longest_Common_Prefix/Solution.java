package Easy.Longest_Common_Prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonPre=strs[0];
        for (String individualStr:strs){
            String temp="";
            for (int i = 0; i < individualStr.length() && i<commonPre.length() ; i++) {
                if(commonPre.charAt(i)==individualStr.charAt(i)){
                    if(temp=="")
                        temp=String.valueOf(individualStr.charAt(i));
                    else
                        temp=temp.concat(String.valueOf(individualStr.charAt(i)));
                }
                else
                    break;

            }
            commonPre=temp;
        }
        return commonPre;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        String[] strs={"cir","car"};
        System.out.println(solution.longestCommonPrefix(strs));
    }
}