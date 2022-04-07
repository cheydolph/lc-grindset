import java.util.*;
import java.io.*;
/**
 * Status: COMPLETED
 * Problem: 704. Binary Search
 * Difficulty: Easy
 * Problem Link: https://leetcode.com/problems/binary-search/
 * 
 * Problem Question: Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
    You must write an algorithm with O(log n) runtime complexity.

    Example 1:
    Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Explanation: 9 exists in nums and its index is 4

    Example 2:
    Input: nums = [-1,0,3,5,9,12], target = 2
    Output: -1
    Explanation: 2 does not exist in nums so return -1

    Constraints:
        1 <= nums.length <= 104
        -104 < nums[i], target < 104
        All the integers in nums are unique.
        nums is sorted in ascending order.

 */

class Solution //Fundamental search algorithm for sorted arrays 
{
    public int search(int[] nums, int target) 
    {
        return bs(nums,target,0,nums.length-1);
    }
    
    public int bs(int[] nums, int target, int low, int high)
    {
        if (high>=low)
        {
            int mid = low + (high-low)/2;
            if (nums[mid]==target)
            {
                return mid;
            }
            if (nums[mid]<target)
            {
                return binarySearch(nums,target,mid+1,high);
            }
            
            return binarySearch(nums,target,low,mid-1);
        }
        return -1;
    }
}

/*
Time: O(n log n)
Space: O(1)
*/