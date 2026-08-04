class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n];
        for(int i=0; i<n; i++)
        {
            if(i==0)
            {
                newNums[i] = nums[0];
            }
            else
            {
              newNums[i] = newNums[i-1]  + nums[i];
            }

        }
        return newNums;
    }
}