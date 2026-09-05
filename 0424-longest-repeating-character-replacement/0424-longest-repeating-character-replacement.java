class Solution {
    public int characterReplacement(String s, int k) {
        
        int n = s.length();
        int low = 0;
        int high = 0;
        int res = 0;
        int maxCount = 0;

        int freq[] = new int[26];

        while(high < n)
        {
            freq[s.charAt(high) - 'A']++;

            maxCount = Math.max(maxCount, freq[s.charAt(high) - 'A']);

            int len = high - low + 1;

            if(len - maxCount > k)
            {
                freq[s.charAt(low) - 'A']--;
                low++;
            }
             res = Math.max(res, high - low + 1);
             high++;
        }

        return res;
    }
}