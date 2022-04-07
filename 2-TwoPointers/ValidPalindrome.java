import java.util.*;
import java.io.*;
/**
 * Status: COMPLETED
 * Problem: 125. Valid Palindrome
 * Difficulty: Easy
 * Problem Link: https://leetcode.com/problems/valid-palindrome/
 * 
 * Problem Question: A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

    Given a string s, return true if it is a palindrome, or false otherwise.

    Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.

    Example 2:
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.

    Example 3:
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.

    Constraints:
        1 <= s.length <= 2 * 105
        s consists only of printable ASCII characters.

 */

class Solution //Simple front-back palindrom check. can be done recursively too
{
    public boolean isPalindrome(String s)
    {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        int front = 0;
        int back = s.length()-1;
        while (front<back)
        {
            if (s.charAt(front)!=s.charAt(back))
            {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
    
    /* Faster Solution
        public boolean isPalindrome(String s) 
        {
        int start = 0; 
        int end = s.length() - 1;
        while(start <= end) 
        {
            while(start <= end && !Character.isLetterOrDigit(s.charAt(start))) 
            {
                start++;
            }
            while(start <= end && !Character.isLetterOrDigit(s.charAt(end))) 
            {
                end--;
            }
            if(start <= end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) 
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
        }
    */
}

/*
Time: O(n)
Space: O(1)
*/