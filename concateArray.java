//  leetcode 1929 concatenation of array

import java.util.Arrays;

public class concateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] result = getConcatenation(nums);

        // Print the result array
        System.out.println(Arrays.toString(result));
    }

    public static int[] getConcatenation(int[] nums) {
        int length = 2 * nums.length;
        int ans[] = Arrays.copyOf(nums, length);

        // Use copyOfRange to copy elements from nums to the second half of ans
        System.arraycopy(nums, 0, ans, nums.length, nums.length);

        return ans;
    }
}
