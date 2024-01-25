// Leetcode 1672 : Reachest customer welth

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWelth = Integer.MIN_VALUE;
        for(int i=0 ; i<accounts.length; i++){
            int ithPerson = arraySum(accounts[i]);
           if(ithPerson > maxWelth)  maxWelth = ithPerson;
        }
        return maxWelth;
    }

    public int arraySum(int[] arr){
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++){
           sum += arr[i];
        }
        return sum;
    }
}