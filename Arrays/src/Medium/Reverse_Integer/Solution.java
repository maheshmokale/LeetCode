package Medium.Reverse_Integer;

class Solution {
    public int reverse(int x) {
        if(x<10 &&x>=0) return x;
        long y=0;

        while(x!=0){
            y+=x%10;
            x/=10;
            if(x!=0)
                y*=10;
        }
        if(y>Integer.MAX_VALUE || y<Integer.MIN_VALUE) return 0;

        return (int) y;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.reverse(1534236469));
    }
}