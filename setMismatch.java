//  given problem : 

// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.=
// Find the number that occurs twice and the number that is missing and return them in the form of an array.


class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];
        sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1) {
                ans[0] = nums[i];
                 ans[1] = i+1;
                 return ans;
            }
        }
        return ans;
    }

    public void sort(int [] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]) swap(arr,i,correct);
            else i++;
        }
    }
    public void swap(int []arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}