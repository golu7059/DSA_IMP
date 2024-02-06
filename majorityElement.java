// leetcode 169 : majority element

class Solution {
    public int majorityElement(int[] nums) {
      int val = nums[0];
      int count = 1;
      for(int i=1; i<nums.length; i++){
          if(nums[i] == val) count++;
          else if(count == 0){  // using this we will found the most repeating element
               val = nums[i];
                count = 1;
          }
          else count--;
      }
    //   int ans = 0;
    //   for(int i=0 ; i<nums.length; i++){
    //       if(val == nums[i]){
    //           ans++;
    //       }
    //   }
    //   if(ans>=nums.length/2) return val;
    //   else return 0;

      return val;
    }
   
}