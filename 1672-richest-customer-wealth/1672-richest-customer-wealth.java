class Solution {
    public int maximumWealth(int[][] accounts) {
        int rows = accounts.length;
        int cols = accounts[0].length;
        int max = 0;
        
        for(int i = 0; i<rows; i++)
        {
            int sum = 0;

            for(int j=0; j<cols; j++)
            {
                sum += accounts[i][j];
            }
            if(sum>max)
            {
                max = sum;
            }
        }
        return max;
    }
}