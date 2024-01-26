//  leetcode 1431 : kids with the greatest number of candies

import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       ArrayList<Boolean> ans = new ArrayList<>();
       // finding greatest
       int greatest = Integer.MIN_VALUE;    
        for(int i=0 ; i<candies.length ; i++){
            if(candies[i]>greatest) greatest = candies[i];
        }

        // let's check and fill the list'
        for(int i=0 ; i<candies.length ; i++){
            if ((candies[i]+extraCandies) >= greatest){
                ans.add(true);
            } else {
                 ans.add(false);
            }
        }
        return ans;
    }
}