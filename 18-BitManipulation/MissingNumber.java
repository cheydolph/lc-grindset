import java.util.*;
import java.io.*;
/**
 * Status: COMPLETED
 * Problem: 268. Missing Number
 * Difficulty: Easy
 * Problem Link: https://leetcode.com/problems/missing-number/
 * 
 * Problem Question: iven an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

    Example 1:
    Input: nums = [3,0,1]
    Output: 2
    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

    Example 2:
    Input: nums = [0,1]
    Output: 2
    Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

    Example 3:
    Input: nums = [9,6,4,2,3,5,7,0,1]
    Output: 8
    Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

    Constraints:
        n == nums.length
        1 <= n <= 104
        0 <= nums[i] <= n
        All the numbers of nums are unique.

    Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?

 */

class Solution {
    public int missingNumber(int[] nums) 
    {
        //Gauss' Arithmetic Series Sum Version
        //Sum of Arithmetic Series
        // Sn = n * (a1 + an)/2
        //Sum of geometric series
        // Sn = [a*(r^n -1)] / (r-1)
        /*
        int expectSum = (nums.length+1)*(nums.length) / 2;
        for (int e : nums)
        {
            expectSum -= e;
        }
        return expectSum;
        */
        
        //Intuitive XOR Sum Way
        int sum = nums.length;
        for (int i=0; i<nums.length; i++)
        {
            sum += (i-nums[i]);
        }
        return sum;
    }
}

/*
Time: O(n)
Space: O(1)
*/