package Add_Binary;

class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j=b.length()-1;
        int carry=0;
        int sum=0;
        String[] sumChar= new String[(Math.max(a.length(),b.length()))+1];
        int k=sumChar.length-1;
        while(i>=0 && j>=0){
            sum=Integer.valueOf(String.valueOf(a.charAt(i)))+Integer.valueOf(String.valueOf(b.charAt(j)))+carry;
            carry=0;
            if(sum/2>0){
                carry=1;
            }
            sumChar[k]=String.valueOf(sum%2);

            i--;
            j--;
            k--;
        }
        while(i>=0){

            sum=Integer.valueOf(String.valueOf(a.charAt(i)))+carry;
            carry=0;
            if(sum/2>0){
                carry=1;
            }
            sumChar[k]=String.valueOf(sum%2);
           i--;k--;
        }
        while(j>=0){
            sum=Integer.valueOf(String.valueOf(b.charAt(j)))+carry;
            carry=0;
            if(sum/2>0){
                carry=1;
            }
            sumChar[k]=String.valueOf(sum%2);
            j--;k--;
        }
        if(carry>0)
            sumChar[0]=String.valueOf(carry);
        String temp="";
        for (String s : sumChar){
            if(s!=null)
                temp=temp.concat(s);
        }

        return temp;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        String a="11";
        String b="1";
         a="100";
        b="110010";
        System.out.println(solution.addBinary(a,b));
    }
}