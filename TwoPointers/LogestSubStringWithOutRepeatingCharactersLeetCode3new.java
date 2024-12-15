package TwoPointers;

import java.util.HashSet;
import java.util.Set;

/* 3. Longest Substring Without Repeating Characters
 Given a string s, find the length of the longest substring  without repeating characters.
Example 1: Input: s = "abcabcbb"  Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2: Input: s = "bbbbb" Output: 1
Explanation: The answer is "b", with the length of 1.
 */

public class LogestSubStringWithOutRepeatingCharactersLeetCode3new {

    /*  1. delcare 2 pointers a_pointer and b_pointer both points to 0 ist char
    1. declare maxCounter =0; to store max count
      2. run for loop till end of the string.
      2a. declare hashSet to store all unique hchacters
      3. use while loop till b-Pointer < s.length() of given string
      4. check if s.charAt(i) is part of hasset if not add it
      5. get the count of set size and compare with maxCOunt variable and incrment b_ponter++
      6. if char of string is laready part of set
      then remove the char from set and incrempent the a_pointer ++ to move next unique elment
     */
    public static int LongestSubString(String s) {
        int left = 0, right = 0;
        int maxCount = 0;
        Set<Character> set = new HashSet<>();
        // FOR LOOP FAILS** it will point to next elelment even if its same or differnt
        //for (int i = b_pointer; i < s.length(); i++) {
        // WHILE LOOP it will point to next element after adding, if already exsiing , it wil remove and add the next unique elelment
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxCount = Math.max(set.size(), maxCount);
            } else {
                set.remove(s.charAt(left));
                left++;
            }

        }


        return maxCount;
    }

    public static void main(String[] args) {
        //String s = "abcabcbb";
        // String s = "bbbbb";
        String s = "pwwkew";

        System.out.println(LongestSubString(s));
    }
}
