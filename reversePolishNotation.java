//   leetcode 150 : reverse polish notationdai

class Solution {
    int pos;
    public int evalRPN(String[] tokens) {
        this.pos = tokens.length-1;
        return evaluate(tokens);
    }

    public int evaluate(String[] t){
        String token = t[pos];
        pos--;
        if(token.equals("+")){
            return evaluate(t) + evaluate(t); 
        }else
        if(token.equals("*")){
            return evaluate(t) * evaluate(t);
        }else 
        if(token.equals("-")){
            return -evaluate(t) + evaluate(t);
        }else
        if(token.equals("/")){
            int right = evaluate(t);
            return evaluate(t) / right;
        }else{
            return Integer.parseInt(token);
        }
    }
}