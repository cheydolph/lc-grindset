import java.util.*;
import java.io.*;
/**
 * Status: COMPLETED
 * Problem: 20. Valid Parentheses
 * Difficulty: Easy
 * Problem Link: https://leetcode.com/problems/valid-parentheses/
 * 
 * Problem Question: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:
        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.

    Example 1:
    Input: s = "()"
    Output: true

    Example 2:
    Input: s = "()[]{}"
    Output: true

    Example 3:
    Input: s = "(]"
    Output: false

    Constraints:
        1 <= s.length <= 104
        s consists of parentheses only '()[]{}'.

 */

class Solution //Use the stack to your advantage
{
    public boolean isValid(String s) 
    {
        Stack<Character> pairs = new Stack<Character>();
        char c = s.charAt(0);
        char top = ' ';
        for (int i=0; i<s.length(); i++)
        {
            c = s.charAt(i);
            if ((c==')'||c=='}')||c==']')
            {
                if (pairs.empty())
                {
                    return false;
                }
                top = (Character) pairs.peek();
                if ((top=='(' && c!=')' || top=='{' && c!='}') || top=='[' && c!=']')
                {
                    return false;
                }
                else
                {
                    pairs.pop();
                }
            }
            else
            {
                pairs.push(s.charAt(i));
            }
        }
        return pairs.empty();
    }
}

/*
Time: O(n)
Space: O(n)
*/