//   leetcode 1389 : create array in given order


import java.util.ArrayList;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }

        // Use toArray method with correct return type
        // return arr.stream().mapToInt(Integer::intValue).toArray();

        for(int i=0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
