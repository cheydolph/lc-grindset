import java.util.*;
import java.io.*;
/**
 * Status: COMPLETED
 * Problem: 15. 3Sum
 * Difficulty: Medium
 * Problem Link: https://leetcode.com/problems/3sum/
 * 
 * Problem Question: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

    Notice that the solution set must not contain duplicate triplets.

    Example 1:
    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]

    Example 2:
    Input: nums = []
    Output: []

    Example 3:
    Input: nums = [0]
    Output: []

    Constraints:

        0 <= nums.length <= 3000
        -105 <= nums[i] <= 105

 */

class Solution //Sort, then treat as 2 Sum
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int li = 0;
        int ri = 0;
        int threeSum = 0;
        //Sort array to treat like 2Sum Sorted problem
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i]>0)
            {
                break;
            }
            if (i>0 && nums[i-1]==nums[i])
            {
                continue;
            }
            li = i+1;
            ri = nums.length-1;
            // System.out.println("i="+i);
            // System.out.println("l="+li);
            // System.out.println("r="+ri);

            while (li<ri)
            {
                threeSum = nums[i] + nums[li] + nums[ri];
                if (threeSum>0)
                {
                    ri--;
                }
                else if (threeSum<0)
                {
                    li++;
                }
                else
                {
                    result.add(new ArrayList<>(Arrays.asList(nums[i],nums[li],nums[ri])));
                    li++;
                    while (nums[li]==nums[li-1] && li<ri)
                    {
                        li++;
                    }
                }
            }
            
        }
        return result;
    }
}

/*
Time: O(n^2)
Space: O(n)
*/