class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
       ArrayList<Integer> pos = new ArrayList<>();
       ArrayList<Integer> neg = new ArrayList<>();

       for(int num : nums)
       {
        if(num < 0)
        {
            neg.add(num);
        } else {
            pos.add(num);
        }
       }

       if(neg.size() == 0)
       {
        for(int i=0; i<n; i++)
        {
            nums[i] = nums[i] * nums[i];
        }
        return nums;
       }

       if(pos.size() == 0)
       {
        for(int i=0; i<n; i++)
        {
        nums[i] = nums[i] * nums[i];
        }

        int left = 0;
        int right = n - 1;

        while(left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
        return nums;
       }

       int p = pos.size();
       for(int i=0; i<p; i++)
       {
        pos.set(i, pos.get(i) * pos.get(i));
       }
       int q = neg.size();
       for(int i=0; i<q; i++)
       {
        neg.set(i, neg.get(i) * neg.get(i));
       }
       Collections.reverse(neg);


       int i = 0;
       int j = 0;
       int id = 0;
       int res[] = new int[p + q];

       while(i < p && j < q)
       {
        if(pos.get(i) <= neg.get(j))
        {
            res[id++] = pos.get(i++);
        } else {
            res[id++] = neg.get(j++);
        }
       }

       while(i < p)
       {
        res[id++] = pos.get(i++);
       }

       while(j < q)
       {
        res[id++] = neg.get(j++);
       }

       return res;
    }
}