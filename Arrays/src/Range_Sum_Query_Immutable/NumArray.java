package Range_Sum_Query_Immutable;

class NumArray {
    final int[] numVal;

    public NumArray(int[] nums) {
        numVal=nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        for (int i = left; i <=right ; i++) {
            sum+=numVal[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] numVal={{-2, 0, 3, -5, 2, -1},{0, 2},{2, 5},{0, 5}};
        String[] operations={"NumArray", "sumRange", "sumRange", "sumRange"};

        NumArray numArray=null;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("NumArray")){
                numArray=new NumArray(numVal[i]);
            }
            else
            {
                System.out.println(numArray.sumRange(numVal[i][0],numVal[i][1]));
            }
        }

    }
}