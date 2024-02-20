// loeetcode 238 : find missing number in the range of [0,n]

class Solution {
    // public int missingNumber(int[] nums) {
    //     int n = nums.length;
    //     int total  =   (n * (n+1))/2;
    //     int sum  =0;
    //     for(int i=0;i< n;i++){
    //         sum += nums[i];
    //     }
    //     return total-sum;
    // }

    // using cyclic sort algorithm
    public int missingNumber(int[] nums) {
        cyclicSort(nums);
        for (int i=0 ; i<nums.length; i++){
           if(nums[i] != i) return i;
        }
        return nums.length;
    }

    public void cyclicSort(int[] nums){
           int i=0;
           while (i<nums.length){
               int correct = nums[i];
               if(nums[i]<nums.length && nums[correct] != nums[i]){
                   swap(nums,i,correct);
               } else {
                   i++;
               }
           }
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}