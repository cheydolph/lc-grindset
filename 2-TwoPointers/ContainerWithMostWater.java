import java.util.*;
import java.io.*;
/**
 * Status: COMPLETED
 * Problem: 11. Container With Most Water
 * Difficulty: Medium
 * Problem Link: https://leetcode.com/problems/container-with-most-water/
 * 
 * Problem Question: You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

    Find two lines that together with the x-axis form a container, such that the container contains the most water.
    Return the maximum amount of water a container can store.
    Notice that you may not slant the container.

    Example 1:
    Input: height = [1,8,6,2,5,4,8,3,7]
    Output: 49
    Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

    Example 2:
    Input: height = [1,1]
    Output: 1

    Constraints:
        n == height.length
        2 <= n <= 105
        0 <= height[i] <= 104

 */

class Solution //Two Pointers problem, left and right
{
    public int maxArea(int[] height) 
    {
        int left = 0;
        int right = 0;
        int lIndex = 0;
        int rIndex = height.length-1;
        int maxVolume = 0;
        int currVol = 0;
        while (lIndex<rIndex)
        {
            left = height[lIndex];
            right = height[rIndex];
            currVol = (rIndex-lIndex)*Math.min(left,right);
            maxVolume = Math.max(maxVolume,currVol);
            if (left<right)
            {
                lIndex++;
            }
            else
            {
                rIndex--;
            }
        }
        return maxVolume;
    }

/*
Time: O(n)
Space: O(1)
*/