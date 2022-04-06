import java.util.*;
import java.io.*;
/**
 * Status: COMPLETED
 * Problem: 242. Valid Anagram
 * Difficulty: Easy
 * Problem Link: https://leetcode.com/problems/valid-anagram/
 * 
 * Problem Question: Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

    Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true

    Example 2:
    Input: s = "rat", t = "car"
    Output: false

    Constraints:
        1 <= s.length, t.length <= 5 * 104
        s and t consist of lowercase English letters.

 */
class Solution //Make a map for each string, check if they are equal
{
    public boolean isAnagram(String s, String t) 
    {
        Map<Character,Integer> maps = new HashMap<>();
        Map<Character,Integer> mapt = new HashMap<>();
        if (s.length()!=t.length())
        {
            return false;
        }
        for (int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            char ct = t.charAt(i);
            if (maps.containsKey(c))
            {
                maps.put(c,maps.get(c)+1);
            }
            else {
                maps.put(c,1);
            }
            if (mapt.containsKey(ct))
            {
                mapt.put(ct,mapt.get(ct)+1);
            }
            else{
                mapt.put(ct,1);
            }
        }
        return maps.equals(mapt);
    }
}

/*
Time: O(n)
Space: O(n)
*/