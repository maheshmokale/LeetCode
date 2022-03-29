package Single_Number;

class Solution {
 public static void main(String[] args){
  Solution solution= new Solution();
  int[] nums={4,1,2,1,2};
  solution.singleNumber(nums);
 }
 public int singleNumber(int[] nums) {
  int num=0;
  for (int i = 0; i < nums.length; i++) {
    num^=nums[i];
  }
  return num;
 }
}


/*
* The XOR logic is needed here so that we can get only the odd one out.
Since all the combination will nullify each other, only the single number will be left which doesnt have any duplicate number.
X Y X^Y
0 0 0
0 1 1
1 0 1
1 1 0

	Since we know X ^ X = 0
	all the duplicate combinations will be nulified
* */