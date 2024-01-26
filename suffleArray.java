// leetcode 1470 : suffle the array

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans = new int[nums.length];
        for(int i=0 ; i<ans.length; i++){
            if((i & 1) == 0) {  // when position is even 
                ans[i] = nums[i/2];
            } else {            // when positin is odd
                ans[i] = nums[i/2 + n];
            }
        }
        return ans;
    }
}