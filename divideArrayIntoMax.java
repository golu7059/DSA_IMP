//  leetcode  2966 : Divide array into arrays with max difference

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        if (nums.length % 3 != 0) {
            return new int[0][0];
        }

        int size = nums.length;

        int max = 0;

        for (int n : nums) {
            max = Math.max(max, n);
        }

        int[] freqs = new int[max + 1];

        for (int n : nums) {
            ++freqs[n];
        }

        int[][] subs = new int[size / 3][3];

        for (int n = 1, r = 0, c = 0; r < subs.length && n <= max;) {
            if (freqs[n] == 0) {
                ++n;
            }
            else if (c == subs[r].length) {
                ++r;
                c = 0;
            }
            else if (c == 0 || n - subs[r][0] <= k) {
                subs[r][c] = n;
                --freqs[n];
                ++c;
            }
            else {
                return new int[0][0];
            }
        }
        return subs;
    }
}