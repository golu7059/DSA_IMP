//  leetcode 231 : return boolean value that given number is the power of two or not

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        if((n&1) == 1) return false;
        return isPowerOfTwo(n/2);
    }
}