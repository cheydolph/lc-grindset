import java.util.*;
import java.io.*;
/**
 * Status: COMPLETED
 * Problem: 70. Climbing Stairs
 * Difficulty: Easy
 * Problem Link: https://leetcode.com/problems/climbing-stairs/
 * 
 * Problem Question: You are climbing a staircase. It takes n steps to reach the top.

    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    Example 1:
    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps

    Example 2:
    Input: n = 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step

    Constraints:
        1 <= n <= 45

 */

class Solution 
{
    public int climbStairs(int n) 
    {
        //Dynamic Programming Solution
        if (n<3)
        {
            return n;
        }
        int[] steps = new int[n];
        steps[0] = 1;
        steps[1] = 2;

        for (int i=2; i<n; i++)
        {
            steps[i] = steps[i-1]+steps[i-2];
        }
        return steps[n-1];
        
        //Recursive Solution
        //return n<3 ? n : climbStairs(n-1) + climbStairs(n-2);
    }
}

/*
Time: O(n)
Space: O(n)
*/