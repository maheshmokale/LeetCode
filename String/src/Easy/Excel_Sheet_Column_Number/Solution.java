package Easy.Excel_Sheet_Column_Number;

class Solution {
    public int titleToNumber(String columnTitle) {
        //65 is the character value of A so we considered 64 to get the exact value of alphabet between A-Z as 1-26
        int pointer = 64;
        int i = 0;
        int sum = 0;
        while (i < columnTitle.length()) {
            int tempVal = columnTitle.charAt(i) - pointer;
            if (columnTitle.length() - 1 - i > 0)
                tempVal = (int) (tempVal * Math.pow(26,(columnTitle.length() - 1 - i) ));
            else
                tempVal = columnTitle.charAt(columnTitle.length() - 1) - pointer;
            sum += tempVal;
            i++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.titleToNumber("XW"));
    }
}