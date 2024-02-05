//  leetcode 1773 : count items matching a rule
//  https://leetcode.com/problems/count-items-matching-a-rule/description/
import java.util.*;
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) { 
        int count = 0;
        
        int i=2;
        if(ruleKey.equals("type")) i=0; 
        if(ruleKey.equals("color")) i=1; 

        for (List<String> l : items) {
            if(l.get(i).equals(ruleValue)) count++;
        }

        return count;
    }
}
