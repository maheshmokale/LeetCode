package Easy.Climbing_Stairs;

public class Solution {
    public int climbStairs(int n) {
        //We will follow the fibonnacci series to solve the problem
        //to climb one step we can do this 1 way = 1
        //for 2step it can be two ways = 1 1, 2
        //for 3 step it can be  1 1 1 , 1 2 , 2 1 which is 3 ways
        //for 4 ways  it can be 1 1 1 1, 1 1 2 , 1 2 1, 2 1 1, 2 2 which is 5 ways
        //hence its fibbonnacci series 1,2,3,5,8,13....
        int i=1;
        int j=1;
        int steps=0;
        while(n-1>=0){
            steps=i+j;
            i=j;
            j=steps;
            n--;
        }
        return i;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.climbStairs(5));

    }
}
