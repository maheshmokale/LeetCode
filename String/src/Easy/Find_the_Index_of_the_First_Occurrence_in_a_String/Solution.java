package Easy.Find_the_Index_of_the_First_Occurrence_in_a_String;

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null || needle==null || haystack.length()<needle.length()) return -1;
        int i=0;
        int j=0;
        int countChar=0;
        int index=-1;
        while (i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                if(index==-1){
                    index=i;
                }
                countChar++;
                j++;
                if(countChar==needle.length()){
                    break;
                }
            }
            else{
                j=0;
                countChar=0;
                index++;
                i=index;
                continue;
            }
            i++;
        }
        if(countChar!=needle.length()) return-1;
        return index;
    }

    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.strStr("mississippi","issip"));
    }
}