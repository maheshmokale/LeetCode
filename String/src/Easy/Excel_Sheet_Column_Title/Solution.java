package Easy.Excel_Sheet_Column_Title;

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnNames=new StringBuilder();
        char charA='A';
        while(columnNumber>26){
            columnNumber--;
            charA+=(columnNumber%26);
            columnNumber/=26;
            columnNames.append((charA));
            charA='A';
        }
        charA+=(columnNumber)-1;
        columnNames.append((charA));
        return columnNames.reverse().toString();
    }
    public static void main(String[] args){
     Solution solution = new Solution();
     System.out.println(solution.convertToTitle(78));
    }
}