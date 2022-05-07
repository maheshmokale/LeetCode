package Add_Binary;

class Solution {

    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder stringBinSum=new StringBuilder();
        while(i>=0 || j>=0){
            int sum=0;
            sum+=carry;
            carry=0;
            if(i>=0){
                sum+=Integer.valueOf(String.valueOf(a.charAt(i)));
                i--;
            }
            if(j>=0){
                sum+=Integer.valueOf(String.valueOf(b.charAt(j)));
                j--;
            }
            if(sum/2>0){
                carry=1;
            }
            stringBinSum=stringBinSum.append(sum%2);
        }
        if(carry>0)
            stringBinSum=stringBinSum.append(carry);
        return stringBinSum.reverse().toString();
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        String a="";
        String b="";

         a="11";
         b="1";
        a="100";
        b="110010";
        System.out.println(solution.addBinary(a,b));
    }
}