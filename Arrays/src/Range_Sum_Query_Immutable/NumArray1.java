package Range_Sum_Query_Immutable;

class NumArray1 {
    final int[] numVal;

    public NumArray1(int[] nums) {
        numVal=new int[nums.length+1];
        numVal[0]=0;
        for (int i = 1; i < nums.length+1; i++) {
            numVal[i]=numVal[i-1]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return numVal[right+1]-numVal[left];
    }
    public static void main(String[] args){
        int[][] nums={{-2, 0, 3, -5, 2, -1},{0, 2},{2, 5},{0, 5}};
        String[] operations={"NumArray", "sumRange", "sumRange", "sumRange"};

        NumArray1 numArray=null;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("NumArray")){
                numArray=new NumArray1(nums[i]);
            }
            else
            {
                System.out.println(numArray.sumRange(nums[i][0],nums[i][1]));
            }
        }
        
    }
}