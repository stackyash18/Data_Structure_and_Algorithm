class Solution {
    public int maximumSum(int[] arr) {

        long noDelete = arr[0];
        long oneDelete = Long.MIN_VALUE / 2;
        long res = arr[0];

        for (int i = 1; i < arr.length; i++) {

            long newNoDelete =
                Math.max(arr[i], noDelete + arr[i]);

            long newOneDelete =
                Math.max(oneDelete + arr[i], noDelete);

            noDelete = newNoDelete;
            oneDelete = newOneDelete;

            res = Math.max(res,
                    Math.max(noDelete, oneDelete));
        }

        return (int) res;
    }
}