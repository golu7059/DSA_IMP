// leetcode 739 : Daily Tempreature

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        
        int hottest = 0;
        
        int answer[] = new int[n];
        
        for (int currDay = n - 1; currDay >= 0; currDay--) {

            int currentTemp = temperatures[currDay];

            // hottest temp seen so far moving from the right
            if (currentTemp >= hottest) {
                hottest = currentTemp;
                continue;
            }
            
            int days = 1;

            while (temperatures[currDay + days] <= currentTemp) {
                // Use information from answer to search for the next warmer day
                days += answer[currDay + days];
            }

            answer[currDay] = days;
        }
        
        return answer;
    }
}