package ArraysLeetCodeFinal.DuplicateArraysLeetCodeFinal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 217. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1: Input: nums = [1,2,3,1] Output: true
Explanation: The element 1 occurs at the indices 0 and 3.

Example 2: Input: nums = [1,2,3,4] Output: false
Explanation: All elements are distinct.

 */
public class ContainsDuplicates {


    // BruteForce Method
    public static boolean containsDuplicate(int[] nums) {

        for(int i=0; i< nums.length;i++)
        {
            for(int j=i+1; j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicateHashMap(nums));
        System.out.println(containsDuplicateHashSet(nums));
    }


    // better Method wit HashMap
    public static boolean containsDuplicateHashMap(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i]))
            {
                return  true;
            }
            else
            {
                map.put(nums[i],i);
            }
        }

        return false;
    }

    // also achive with Set
    // better Method wit HashMap
    public static boolean containsDuplicateHashSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            if(set.contains(nums[i]))
            {
                return true;
            }
            else
            {
                set.add(nums[i]);
            }
        }

        return false;
    }


}
