// leetcode 1920


public class buildArray {
    // function for leetcode
    public int[] buildArrayfunction(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
    public static void main(String[] args) {
        // rest code goes here
    }
}
