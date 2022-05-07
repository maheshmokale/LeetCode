package Length_of_Last_Word;

class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for (int i = s.length()-1; i >=0; i--) {
            if(s.charAt(i)==' ' && count>0){
                break;
            }
            else if(s.charAt(i)!=' ') {
                count++;
            }
        }
        return count;
    }
    public int lengthOfLastWordNew(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        String str="luffy is still joyboy";
        System.out.println(solution.lengthOfLastWord(str));
    }
}