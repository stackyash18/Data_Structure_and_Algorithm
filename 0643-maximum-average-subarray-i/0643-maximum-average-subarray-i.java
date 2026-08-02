class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int n = nums.length;
     int current = 0;
     for(int i=0; i<k; i++)
     {
        current += nums[i];
     }   

     int maxx = current;

     for(int i=1; i<=n-k; i++)
     {
        current = current - nums[i-1] + nums[i+k-1];
     
     if(current>maxx)
     {
        maxx = current;
     }

     }

     return (double)maxx/k;
    }
}