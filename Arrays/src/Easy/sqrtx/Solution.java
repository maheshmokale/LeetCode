package Easy.sqrtx;

public class Solution {

    public static void main(String[] args){
        Solution solution=new Solution();
       // System.out.println(solution.sqrt(10));
        System.out.println(solution.sqrtCal(10));

    }

    public int sqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = x;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }

    public int sqrtCal(int x){
        if(x==0) return x;
        int left=1;
        int right=x;
        while(true){
            int mid=left+(right-left)/2;
            if(mid>x/mid){
                right=mid-1;
            }
            else{
                if((mid+1)>x/(mid+1)){
                    return mid;
                }
                left=mid+1;
            }
        }
    }

}


