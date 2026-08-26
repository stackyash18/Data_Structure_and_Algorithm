class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        int low = 0;
        int high = 2;
        int k = 2;

        while(high<n)
        {
            if(nums[high] == nums[low])
            {
                high++;
                continue;
            }
            nums[low+2] = nums[high];
            low++;
            high++;
            k++;
        }
        return k;
    }
}