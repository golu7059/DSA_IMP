//   leetcode 387 : find the first unique character

//  link : https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;   // store repetation of each character
        }
        for(int i=0 ; i<s.length();i++ ){
            char ch = s.charAt(i);
            if(arr[ch-'a']==1) return i;    // first character which value is 1
        } 
        return -1;
    }
}