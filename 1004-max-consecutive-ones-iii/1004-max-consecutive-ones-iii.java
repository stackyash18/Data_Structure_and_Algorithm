class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;

        int low = 0;
        int high = 0;
        int res = 0;
        int zeros = 0;
        
        while(high < n)
        {
            if(nums[high] == 0)
            {
                zeros++;
            }

            while(zeros > k)
            {
                if(nums[low] == 0)
                {
                    zeros--;
                }
                low++;
            }
            res = Math.max(res, high - low + 1);
            high++;
        }
        return res;
    }
}