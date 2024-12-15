package ArraysLeetCodeFinal.DuplicateArraysLeetCodeFinal;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicatesII {
    /* 219. Contains Duplicate II
 Given an integer array nums and an integer k, return true if there are two distinct indices i and j in
  the   array such that nums[i] == nums[j] and abs(i - j) <= k.

 Example 1: Input: nums = [1,2,3,1], k = 3 Output: true
Example 2: Input: nums = [1,0,1,1], k = 1 Output: true
Example 3:Input: nums = [1,2,3,1,2,3], k = 2  Output: false
     */


    public static boolean containsDuplicateIIHashMap(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                int pastIndex = map.get(nums[i]);
                if (Math.abs(pastIndex - i) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);   // i could be in the next index , so cant retuen false
                }

            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 2, 3};  // false
        int k = 2;
        System.out.println(containsDuplicateIIHashMap(nums, k));

    }
}
