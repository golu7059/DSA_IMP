//  leetcode 232 : Implement a first in first out (FIFO) queue using only two stacks. 
//   The implemented queue should support all the 
//   functions of a normal queue (push, peek, pop, and empty).


import java.util.*;
class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(st.isEmpty()) st.push(x);
        else{
            while(st.size() > 0){
                helper.push(st.pop());
            }
            st.push(x);
            while(helper.size() > 0){
                st.push(helper.pop());
            }
        }
    }
    
    public int pop() {
       return  st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */