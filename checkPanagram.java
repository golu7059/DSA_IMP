// leetcode 1832 : check if the sentense is panagram
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

class Solution {
    public boolean checkIfPangram(String sentence) {
        // storing repeat of each charater of the given sentence 
        int arr[] = new int[26];
        for(char ch : sentence.toCharArray()){
            int index = ch-'a';
            arr[index]++;
        }

// if any alphabate is missing then return false otherwise true
        for (int i=0 ; i<arr.length; i++){
            if(arr[i] ==0) return false;
        }

        return true;
    }
}