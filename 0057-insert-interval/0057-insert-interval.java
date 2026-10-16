
import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        boolean insert = false;

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];

            if (insert == false && newInterval[0] <= start) {
                res.add(newInterval);
                insert = true;
            }

            res.add(intervals[i]);
        }

        if (insert == false) {
            res.add(newInterval);
        }

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < res.size(); i++) {
            int start = res.get(i)[0];
            int end = res.get(i)[1];

            if (ans.isEmpty() ||
                ans.get(ans.size() - 1)[1] < start) {

                ans.add(new int[]{start, end});

            } else {
                ans.get(ans.size() - 1)[1] =
                    Math.max(ans.get(ans.size() - 1)[1], end);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
