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
    public static String  longestCommonPrefix1(String[] strs) {
        if(strs==null || strs.length==0) return null;
        if(strs.length==1) return strs[0];
        int i=1;
        String temp = null;
        String commonPrefix=strs[0];
        while(i<strs.length){
            int j=0;
            while(j<commonPrefix.length() && j<strs[i].length()){
                if (commonPrefix.charAt(j)==strs[i].charAt(j)){
                    if(temp==null)
                        temp=String.valueOf(commonPrefix.charAt(j));
                    else
                        temp=temp.concat(String.valueOf(commonPrefix.charAt(j)));
                }
                else{
                    break;
                }
                j++;
            }
            commonPrefix=temp;
            if(commonPrefix==null) return "";
            temp=null;
            i++;
        }
        return commonPrefix;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        String[] strs={"flower","flow","flight"};
        //System.out.println(solution.longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix1(strs));
    }
}