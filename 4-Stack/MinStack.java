import java.util.*;
import java.io.*;
/**
 * Status: COMPLETED
 * Problem: 155. Min Stack
 * Difficulty: Easy
 * Problem Link: https://leetcode.com/problems/min-stack/
 * 
 * Problem Question: Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    Implement the MinStack class:
        MinStack() initializes the stack object.
        void push(int val) pushes the element val onto the stack.
        void pop() removes the element on the top of the stack.
        int top() gets the top element of the stack.
        int getMin() retrieves the minimum element in the stack.

    Example 1:
    Input
    ["MinStack","push","push","push","getMin","pop","top","getMin"]
    [[],[-2],[0],[-3],[],[],[],[]]
    Output
    [null,null,null,null,-3,null,0,-2]
    Explanation
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.getMin(); // return -3
    minStack.pop();
    minStack.top();    // return 0
    minStack.getMin(); // return -2

    Constraints:
        -231 <= val <= 231 - 1
        Methods pop, top and getMin operations will always be called on non-empty stacks.
        At most 3 * 104 calls will be made to push, pop, top, and getMin.

 */

 class MinStack {

    private List<Integer> stack;
    private List<Integer> minStack;
    
    public MinStack() 
    {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }
    
    public void push(int val) 
    {
        stack.add(val);
        if (minStack.isEmpty() || val<=minStack.get(minStack.size()-1))
        {
            minStack.add(val);
        }
    }
    
    public void pop() 
    {
        if (stack.get(stack.size()-1).equals(minStack.get(minStack.size()-1)))
        {
            minStack.remove(minStack.size()-1);
        }
        stack.remove(stack.size()-1);
    }
    
    public int top() 
    {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() 
    {
        return minStack.get(minStack.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

/*
Time: O(n)
Space: O(n)
*/