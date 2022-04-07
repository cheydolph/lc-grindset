import java.util.*;
import java.io.*;
/**
 * Status: COMPLETED
 * Problem: 3. Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Problem Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * 
 * Problem Question: Given a string s, find the length of the longest substring without repeating characters.

    Example 1:
    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.

    Example 2:
    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.

    Example 3:
    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

    Constraints:
        0 <= s.length <= 5 * 104
        s consists of English letters, digits, symbols and spaces.

 */

class Solution //best example of Sliding Window problem
//when character hits duplicate, shift left side of window until no more duplicate characters are hit
{
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> chars = new HashSet<>();
        int maxSize = 0;
        int left = 0;
        for(int i=0; i<s.length(); i++)
        {
            while (chars.contains(s.charAt(i)))
            {
                chars.remove(s.charAt(left));
                left++;
            }
            chars.add(s.charAt(i));
            maxSize = Math.max(maxSize,i-left+1);
        }
        return maxSize;
    }
}

/*
Time: O(n)
Space: O(1)
*/