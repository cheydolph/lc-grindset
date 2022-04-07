import java.util.*;
import java.io.*;
/**
 * Status: COMPLETED
 * Problem: 4. Median of Two Sorted Arrays
 * Difficulty: Hard
 * Problem Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
 * 
 * Problem Question: Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
    The overall run time complexity should be O(log (m+n)).

    Example 1:
    Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
    Explanation: merged array = [1,2,3] and median is 2.

    Example 2:
    Input: nums1 = [1,2], nums2 = [3,4]
    Output: 2.50000
    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

    Constraints:
        nums1.length == m
        nums2.length == n
        0 <= m <= 1000
        0 <= n <= 1000
        1 <= m + n <= 2000
        -106 <= nums1[i], nums2[i] <= 106

 */

class Solution //This one's a toughie, def review
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int midIndex = 0;
        int combined[] = new int[nums1.length+nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (k<combined.length)
        {
            if (i<nums1.length && j<nums2.length)
            {
                if (nums1[i]<=nums2[j])
                {
                    combined[k] = nums1[i];
                    i++;
                }
                else if (nums2[j]<nums1[i])
                {
                    combined[k] = nums2[j];
                    j++;
                }
            }
            else if (i<nums1.length)
            {
                combined[k] = nums1[i];
                i++;
            }
            else if (j<nums2.length)
            {
                combined[k] = nums2[j];
                j++;
            }
            k++;
        }
        if ((nums1.length+nums2.length)%2==1)
        {
            midIndex = ((nums1.length+nums2.length)/2);
            return combined[midIndex]/1.0;
        }
        else
        {
            midIndex = ((nums1.length+nums2.length)/2)-1;
            return (combined[midIndex]+combined[midIndex+1])/2.0;
        }
    }
}

/*
Time: O(n)
Space: O(n)
*/