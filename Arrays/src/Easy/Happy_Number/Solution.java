package Easy.Happy_Number;

public class Solution {
    public boolean isHappy(int n) {
        int number=0;

        while(n!=0){
            if((n==2 || n==3)&& number ==0)
                return false;
            number+=Math.pow(n%10,2);
            n=n/10;
            if(number==1 && n==0)
                return true;

            else{
                if(n==0){
                    n=number;
                    number=0;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.isHappy(23));
    }
}
