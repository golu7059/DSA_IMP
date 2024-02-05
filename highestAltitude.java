//  leetcode 1732 : Find the highest altitude
//    https://leetcode.com/problems/find-the-highest-altitude/description/

class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int altitude = 0;  //making both initial 0

        for(int i=0 ; i<gain.length; i++){
             altitude = altitude+gain[i];
            if(altitude > ans) ans = altitude; // if altitude find greather than previous then update
        }
        return ans;
    }
}